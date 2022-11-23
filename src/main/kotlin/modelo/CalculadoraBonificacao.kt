package modelo

import modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//Ultilizamos o Polimorfismo com o tipo mais Generico -modelo.Funcionario- dado que o metodo bonificacao() é para todos

//    fun registra(funcionario: modelo.Gerente) {
//        this.total += funcionario.bonificacao
//    }
//
//    fun registra(funcionario: modelo.Diretor) {
//        this.total += funcionario.bonificacao
//    }
}