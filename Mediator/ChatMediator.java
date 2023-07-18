package Mediator;

interface ChatMediator {

    void adicionarUsuario(Usuario usuario);

    void enviarMensagem(String mensagem, Usuario remetente);
}