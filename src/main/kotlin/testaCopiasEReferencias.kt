fun testaCoipiasEReferencias() {
    //Entendendo referencias de objetos em kotlin
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("Joao", 456)
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Joao: ${contaMaria.titular}")
}