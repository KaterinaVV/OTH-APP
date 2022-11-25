package de.oth.othappserver.webuntis

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.ByteArrayEntity

data class WebUntisRequest<T : WebUntisResource>(val type: Class<T>, val id: String, val method: String, val params: Map<String, Any>?, val jsonrpc: String = "2.0") {
    fun asHttpPost(mapper: ObjectMapper, uri: String): HttpPost {
        val post = HttpPost(uri)
        post.entity = ByteArrayEntity(mapper.writeValueAsBytes(this))

        return post
    }
}
