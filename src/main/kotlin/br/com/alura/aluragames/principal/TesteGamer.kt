import br.com.alura.aluragames.modelo.Gamer

fun main(){
    val gamer1 = Gamer("Jacque", "jacque@gmail.com")
    println(gamer1)

    val gamer2 = Gamer("jani", "jani@hot.com","11/02/1978", "ribamax" )
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "10/01/2020"
        it.usuario = "lives"

    }

    println(gamer1)
}