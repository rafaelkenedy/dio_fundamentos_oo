package dio.diobank

class Pessoa {
    var nome: String = "Rafael"
    var cpf: String = "051"
    private set

    constructor()

//    inner class endereco{
//        var rua: String = "Rua duque"
//    }
}

fun main(){

    val rafael = Pessoa()

    println(rafael.nome)
    println(rafael.cpf)


}