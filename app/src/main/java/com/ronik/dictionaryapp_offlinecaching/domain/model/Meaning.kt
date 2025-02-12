package com.ronik.dictionaryapp_offlinecaching.domain.model



data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
