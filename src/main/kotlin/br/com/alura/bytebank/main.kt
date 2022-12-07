import br.com.alura.bytebank.modelo.*
fun main() {
    println("Bytebank")

    //Entendendo Object Expressions
    val ka = object : Autenticavel{
        val nome: String = "Karina"
        val cpf: String = " 456.456.456.56"
        val senha: Int = 123

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(ka, senha = 123)

    val renan = Cliente(nome = "Renan", cpf = "45464654654", senha = 23)
    val contaTeste = ContaPoupanca(titular = renan, numero = 566565)


    //testaContasDiferentes()

    println("total de contas: ${totalContas}")
    //Nessa situacação foi transferida a variavel global para a classe conta, E foi privado o set dela.
    //Então ela fica restrica apenas a classe conta, trazendo mais segurança para o atributo.

}









