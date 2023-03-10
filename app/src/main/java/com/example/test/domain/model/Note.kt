package com.example.test.domain.model

data class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String,
    val createAt: Long
) {
    companion object {
        private const val DEFAULT_ID = 0
    }
}