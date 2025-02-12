package com.ronik.dictionaryapp_offlinecaching.domain.repository


import com.ronik.dictionaryapp_offlinecaching.domain.model.WordInfo
import com.ronik.dictionaryapp_offlinecaching.core.Resource
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}