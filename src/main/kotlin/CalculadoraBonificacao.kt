class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//Ultilizamos o Polimorfismo com o tipo mais Generico -Funcionario- dado que o metodo bonificacao() é para todos

//    fun registra(funcionario: Gerente) {
//        this.total += funcionario.bonificacao
//    }
//
//    fun registra(funcionario: Diretor) {
//        this.total += funcionario.bonificacao
//    }
}