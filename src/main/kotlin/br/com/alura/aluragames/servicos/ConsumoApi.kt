package br.com.alura.aluragames.servicos

import br.com.alura.aluragames.modelo.InfoJogo
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpClient.newHttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

class ConsumoApi {
    fun buscaJogo(id:String): InfoJogo{
        val endereco = "https://www.cheapshark.com/api/1.0/games?id=$id"

        val client: HttpClient = newHttpClient ()
        val request: HttpRequest = HttpRequest.newBuilder ()
            .uri(URI.create(endereco))
            .build()

        val response = client
            .send(request, BodyHandlers.ofString())
        val json = response.body()
        val gson = Gson()
        val meuInfoJogo = gson.fromJson(json, InfoJogo::class.java)

        return meuInfoJogo

    }

}