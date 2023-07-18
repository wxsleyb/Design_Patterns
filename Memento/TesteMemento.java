public class TesteMemento {
    public static void main(String[] args) {
        Objeto objeto = new Objeto();
        objeto.setEstado(new Estado("Estado 1"));
        objeto.exibirTexto();
        
        GerenciadorMemento gerenciador = new GerenciadorMemento();
        gerenciador.salvarEstado(objeto);
        
        objeto.setEstado(new Estado("Estado 2"));
        objeto.exibirTexto();
        
        gerenciador.restaurarEstado(objeto);
        objeto.exibirTexto();
    }
}
