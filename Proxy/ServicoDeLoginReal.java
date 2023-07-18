package Proxy;

public class ServicoDeLoginReal implements ServicoDeLogin {
    public void login(String usuario, String senha) {
        System.out.println("Login realizado com sucesso para o usuário " + usuario);
    }
}
