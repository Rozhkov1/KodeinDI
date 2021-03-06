package com.rogok.kodeindi.data.model

class Quote(
    val text: String,
    val author: String
) {
    override fun toString(): String {
        return "$text - $author"
    }
}