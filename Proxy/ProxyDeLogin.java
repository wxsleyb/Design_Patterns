package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyDeLogin implements ServicoDeLogin {
    private ServicoDeLoginReal servicoDeLoginReal;
    private List<String> usuariosBloqueados;

    public ProxyDeLogin() {
        usuariosBloqueados = new ArrayList<String>();
        usuariosBloqueados.add("wesley");
        usuariosBloqueados.add("marcelo");
    }

    public void login(String usuario, String senha) {
        if (usuariosBloqueados.contains(usuario)) {
            System.out.println("Usuário " + usuario + " está bloqueado. Acesso negado.");
        } else {
            if (servicoDeLoginReal == null) {
                servicoDeLoginReal = new ServicoDeLoginReal();
            }
            servicoDeLoginReal.login(usuario, senha);
        }
    }
}
