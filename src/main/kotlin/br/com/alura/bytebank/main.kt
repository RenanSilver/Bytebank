import br.com.alura.bytebank.modelo.*

var totalContas = 0
fun main() {
    println("Bytebank")

    val renan = Cliente(nome = "Renan", cpf = "45464654654", senha = 23)
    val contaTeste = ContaPoupanca(titular = renan, numero = 566565)


    testaContasDiferentes()

    println("total de contas: ${totalContas}")
    //Aqui o total de contas criadas foi adicionado como planejado, usando uma bvariavel global.

}









