import br.com.alura.bytebank.modelo.*

fun main() {
    println("Bytebank")

    val renan = Cliente(nome = "Renan", cpf = "45464654654", senha = 23)
    val contaTeste = ContaPoupanca(titular = renan, numero = 566565)


    testaContasDiferentes()

    println("total de contas: ${contaTeste.total}")
    //O resultado será sempre 1, pois o somador esta interligado apenas com a instancia.

}









