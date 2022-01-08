package com.fuka.turkomator.util

import com.fuka.turkomator.model.Word
import com.google.gson.Gson
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*

class GetWord(private val input: String) {

    /*
    does an http request with ktor and returns
    the [input] as a "Word" class.
    */
    suspend operator fun invoke(): Word {
        val dictionaryURL = "https://sozluk.gov.tr/gts?ara=$input"
        val client = HttpClient(CIO)
        val rawResponse: String = client.get(dictionaryURL)
        client.close()

        /*
        if the word doesn't exist, the api responses with
        an object with the value "Sonuç bulunamadı" and
        not with a response code like 404 or similar.
        */
        if ("bulunamadı" in rawResponse) {
            throw Exception("not_found")
        }

        /*
        the api response starts always with an array,
        even if there's only one meaning of the word.
        therefore the data class for it also does so.
        */
        return Gson().fromJson(rawResponse, Word::class.java)
    }
}