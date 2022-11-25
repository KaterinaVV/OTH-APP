package de.oth.othappserver.utils

import org.apache.http.client.methods.HttpPost

fun HttpPost.entityContains(content: String): Boolean {
    return this.entity.content.bufferedReader().use { it.readText() }.contains(content)
}
