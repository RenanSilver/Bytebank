class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Senha correta!")
        } else {
            println("Falha na autenticacao")
        }
    }

}