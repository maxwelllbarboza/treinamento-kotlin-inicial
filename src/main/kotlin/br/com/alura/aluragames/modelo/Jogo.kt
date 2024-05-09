package br.com.alura.aluragames.modelo

data class Jogo(val titulo: String, val capa: String) {
    var descricao: String? =  null

    override fun toString(): String {
        return "Meu br.com.alura.aluragames.modelo.Jogo:\n" +
                "Titulo: $titulo \n" +
                "capa: $capa \n" +
                "descricao: $descricao"
    }

}