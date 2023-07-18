public class GerenciadorMemento {
    private Memento memento;
    
    public void salvarEstado(Objeto objeto) {
        memento = new Memento(objeto.getEstado());
    }
    
    public void restaurarEstado(Objeto objeto) {
        objeto.setEstado(memento.getEstado());
    }
}
