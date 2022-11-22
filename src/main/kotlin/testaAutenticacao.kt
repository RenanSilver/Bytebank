fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Josue",
        cpf = "555.999.666.33",
        salario = 5000.0,
        senha = 987654321
    )

    val cliente = Cliente(
        nome = "Clientao",
        cpf = "999.999.999-23",
        senha = 123456
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 987654320)
    sistema.entra(cliente, 1230056)

}