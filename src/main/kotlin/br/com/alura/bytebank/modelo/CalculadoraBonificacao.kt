package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set


    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

    //12-01-23---Foi usado um exemplo do uso do Any em uma class Propria criada. Usando cast "as".
//    //fun registra(funcionario: Any){
//        //val funcionarioNovo: Funcionario = funcionario as Funcionario
//        //Smart Cast: é uma maneira de enxugar o codigo. Acima vemos a maneira mas refenrente a outras linguagens.
//        //Abaixo (em compilação) o Smart Cast.
//        funcionario as Funcionario
//        if (funcioanrio is Funcionario) {
//        println("Nome: ${funcionario.nome}")
//        this.total += funcionario.bonificacao
//        } O uso do IF vai com o Cast "is" usado para não ser permitido com que se passe outros parametros alem de Funcioanrio.
//    //12-01-23--- Nesse ponto estamos aprendendo a class Any, e sobre ela o Cast, usando o "as" para especificar o tipo da variavel
//    }

//Ultilizamos o Polimorfismo com o tipo mais Generico -modelo.Funcionario- dado que o metodo bonificacao() é para todos

//    fun registra(funcionario: modelo.Gerente) {
//        this.total += funcionario.bonificacao
//    }
//
//    fun registra(funcionario: modelo.Diretor) {
//        this.total += funcionario.bonificacao
//    }
}