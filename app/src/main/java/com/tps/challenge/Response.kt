package com.tps.challenge

sealed class Response(val message: String) {
    class Error(errorMessage: String): Response(message = errorMessage)
}