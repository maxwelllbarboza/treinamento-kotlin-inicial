data class Jogo( val titulo: String, val capa: String) {
    val descricao =  ""

    override fun toString(): String {
        return "Meu Jogo:\n" +
                "Titulo: $titulo \n" +
                "capa: $capa \n" +
                "descricao: $descricao"
    }

}