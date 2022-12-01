fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta e positiva")
    } else if (saldo == 0.0) {
        println("conta neutra")
    } else {
        println("conta negativa")
    }
//Da pra usar o when no lugar do if
    when {
        saldo > 0.0 -> println("modelo.Conta Positiva")
        saldo == 0.0 -> println("modelo.Conta Zerada")
        else -> println("modelo.Conta Negativa")
    }
}