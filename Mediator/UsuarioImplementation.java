package Mediator;

class UsuarioImplementation implements Usuario {

    private String nome;
    private ChatMediator chatMediator;

    public UsuarioImplementation(String nome, ChatMediator chatMediator) {
        this.nome = nome;
        this.chatMediator = chatMediator;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        this.chatMediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(this.nome + " recebeu a mensagem: " + mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
