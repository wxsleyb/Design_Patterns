package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImplementation implements ChatMediator {

    private List<Usuario> usuarios;

    public MediatorImplementation() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : this.usuarios) {
            if (usuario != remetente) {
                usuario.receberMensagem(mensagem);
            }
        }
    }
}
