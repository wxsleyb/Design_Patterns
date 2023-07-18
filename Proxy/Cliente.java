package Proxy;

public class Cliente {
    public static void main(String[] args) {
        ServicoDeLogin servicoDeLogin = new ProxyDeLogin();
        servicoDeLogin.login("wesley", "123456"); 
        servicoDeLogin.login("joão", "654321"); 
    }
}
