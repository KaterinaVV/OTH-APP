package de.oth.othappserver.webuntis

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class WebUntisUtils {
    companion object {
        const val DateFormat = "yyyyMMdd"
        const val DateTimeFormat = "yyyyMMdd'T'HHmm"
        val WebUntisDateFormatter = DateTimeFormatter.ofPattern(DateFormat)
        val WebUntisDateTimeFormatter = DateTimeFormatter.ofPattern(DateTimeFormat)
        val WebUntisTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")

        fun toBerlinOffset(date: String, time: String): OffsetDateTime {
            val timeValue = when {
                time.length < 4 -> "0".repeat(4 - time.length) + time
                else -> time
            }
            val zone = ZoneId.of("Europe/Berlin")
            val localDateTime = LocalDateTime.parse("${date}T$timeValue", WebUntisDateTimeFormatter)
            val zoneOffSet = zone.rules.getOffset(localDateTime)

            return localDateTime.atOffset(zoneOffSet)
        }

        /**
         * Convert LocalTime objects to strings in form of "12:30"
         */
        fun convertTimeToString(time: LocalTime): String {
            return time.format(WebUntisTimeFormatter)
        }
    }
}
