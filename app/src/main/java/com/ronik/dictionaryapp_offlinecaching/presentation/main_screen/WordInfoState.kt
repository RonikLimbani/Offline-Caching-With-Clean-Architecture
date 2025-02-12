package com.ronik.dictionaryapp_offlinecaching.presentation.main_screen

import com.ronik.dictionaryapp_offlinecaching.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)