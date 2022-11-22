private fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Josue",
        cpf = "555.999.666.33",
        salario = 5000.0,
        senha = 987654321
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 987654320)
}