package de.oth.othappserver.extension

import org.apache.http.HttpResponse
import org.springframework.http.HttpStatus

/**
 * Whether this status code is in the HTTP series HttpStatus.Series.SUCCESSFUL.
 */
fun HttpResponse.is2xxSuccessful(): Boolean =
    HttpStatus.valueOf(statusLine.statusCode).is2xxSuccessful
