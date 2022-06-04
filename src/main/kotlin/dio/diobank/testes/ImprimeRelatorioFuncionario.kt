package dio.diobank.testes

import dio.diobank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}