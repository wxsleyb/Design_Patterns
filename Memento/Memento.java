class Memento {
    private Estado estado;
    
    public Memento(Estado estado) {
        this.estado = estado;
    }
    
    public Estado getEstado() {
        return estado;
    }
}