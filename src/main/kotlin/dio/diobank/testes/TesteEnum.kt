package dio.diobank.testes

import dio.diobank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{
        println("$it - ${it.descricao}")
    }
}