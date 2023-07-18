package Mediator;

public class MediatorMain {

    public static void main(String[] args) {
        ChatMediator chatMediator = new MediatorImplementation();

        Usuario usuario1 = new UsuarioImplementation("Wesley", chatMediator);
        Usuario usuario2 = new UsuarioImplementation("Bernardo", chatMediator);
        Usuario usuario3 = new UsuarioImplementation("Felipe", chatMediator);

        chatMediator.adicionarUsuario(usuario1);
        chatMediator.adicionarUsuario(usuario2);
        chatMediator.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Bom dia wesley!");
        usuario2.enviarMensagem("Olá bernardo como vai?");
        usuario3.enviarMensagem("Tenha uma boa semana felipe!");
    }
}
