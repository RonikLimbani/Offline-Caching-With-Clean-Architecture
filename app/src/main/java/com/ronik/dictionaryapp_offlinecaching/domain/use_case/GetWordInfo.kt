package com.ronik.dictionaryapp_offlinecaching.domain.use_case


import com.ronik.dictionaryapp_offlinecaching.domain.model.WordInfo
import com.ronik.dictionaryapp_offlinecaching.domain.repository.WordInfoRepository
import com.ronik.dictionaryapp_offlinecaching.core.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}