fun main() {
    for (i in 5 downTo 1 step 4) {
        val titular: String = "Renan $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("---------------------------")

        //testaCondicoes(saldo)

    }

}
fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta e positiva")
    } else if (saldo == 0.0) {
        println("conta neutra")
    } else {
        println("conta negativa")
    }

}

//Da pra usar o when no lugar do if
//when {
//    saldo > 0.0 -> println("Conta Positiva")
//    saldo == 0.0 -> println("Conta Zerada")
//    else -> println("Conta Negativa")
//}