package com.ronik.dictionaryapp_offlinecaching.presentation

import com.ronik.dictionaryapp_offlinecaching.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)