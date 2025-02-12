package com.ronik.dictionaryapp_offlinecaching.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ronik.dictionaryapp_offlinecaching.domain.model.Meaning
import com.ronik.dictionaryapp_offlinecaching.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic
        )
    }
}
