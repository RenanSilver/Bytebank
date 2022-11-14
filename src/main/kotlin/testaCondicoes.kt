fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta e positiva")
    } else if (saldo == 0.0) {
        println("conta neutra")
    } else {
        println("conta negativa")
    }
//Da pra usar o when no lugar do if
    when {
        saldo > 0.0 -> println("Conta Positiva")
        saldo == 0.0 -> println("Conta Zerada")
        else -> println("Conta Negativa")
    }
}