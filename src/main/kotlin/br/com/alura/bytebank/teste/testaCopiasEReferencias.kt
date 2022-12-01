import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCoipiasEReferencias() {
    //Entendendo referencias de objetos em kotlin
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "Joao", cpf = "999999", senha = 66666666)
    val maria = Cliente(nome = "Maria", cpf = "852852", senha = 25825412)

    val contaJoao = ContaCorrente(joao, 456)
    contaJoao.titular.nome = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular.nome = "Maria"

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Joao: ${contaMaria.titular}")
}