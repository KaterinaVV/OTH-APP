package de.oth.othappserver.rest

import de.oth.othappserver.api.FeedbackApi
import de.oth.othappserver.exchange.ExchangeClient
import de.oth.othappserver.model.FeedbackItem
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.zalando.problem.Problem
import org.zalando.problem.Status

@RestController
open class FeedbackController internal constructor(
    private val exchangeClient: ExchangeClient?
) : FeedbackApi {

    companion object {
        private val VALID_CATEGORIES = listOf("Bug", "Feedback", "Idee")
        private val logger = LoggerFactory.getLogger(FeedbackController::class.java)
    }

    override fun feedback(
        feedbackItem: FeedbackItem?
    ): ResponseEntity<Unit> {
        if (feedbackItem == null) {
            throw Problem.valueOf(Status.BAD_REQUEST, "feedbackItem mustn't be null!")
        }
        if (exchangeClient != null) {
            exchangeClient.sendFeedbackMail(feedbackItem)
        } else {
            logger.info(
                "No exchange client present, won't send a feedback mail! Contents:\n" +
                    feedbackItem.toStringWithoutImages()
            )
        }
        return ResponseEntity.accepted().build()
    }

    private fun FeedbackItem.toStringWithoutImages(): String {
        return "FeedbackItem(category=$category, message='$message', contactAddress=$contactAddress)"
    }
}
