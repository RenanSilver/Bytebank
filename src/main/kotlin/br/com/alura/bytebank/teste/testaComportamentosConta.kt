import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val renan = Cliente(nome = "Renan", cpf = "45654654654", senha = 456456)
    val contaRenan = ContaCorrente(renan, 1000)
    contaRenan.deposita(600.0)

    //labels. Se existe algum parametro com com valor definido consigomos alteralo dessa maneira.
    val karina = Cliente(nome = "Karina", cpf = " 213132132", senha = 789789)
    val contaKarina = ContaPoupanca(titular = karina, numero = 500)
    contaKarina.deposita(500.0)

    println(contaKarina.titular)
    println(contaKarina.numero)
    println(contaKarina.saldo)

    println(contaRenan.titular)
    println(contaRenan.numero)
    println(contaRenan.saldo)
}