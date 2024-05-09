package br.com.alura.aluragames.principal

import br.com.alura.aluragames.modelo.Jogo
import br.com.alura.aluragames.servicos.ConsumoApi
import java.util.*


fun main() {

    val leitura = Scanner(System.`in`)
    println("Digite o código do jogo:")
    val busca = leitura.nextLine()

    val buscaApi = ConsumoApi()
    val informacaoJogo = buscaApi.buscaJogo(busca)

    var meuJogo: Jogo? = null

    val resultado = runCatching {
        meuJogo = Jogo(informacaoJogo.info.title, informacaoJogo.info.thumb)

    }
    resultado.onFailure {
        println("br.com.alura.aluragames.modelo.Jogo inexistente. tente outro id.")
    }
    resultado.onSuccess {
        println("Deseja uma descrição personalizada? S/N")
        val opcao = leitura.nextLine()
        if(opcao.equals("s", true)){
            println("Insira a descrição personalizada:")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        }else{
            meuJogo?.descricao = meuJogo?.titulo
        }
    }
    println(meuJogo)

}