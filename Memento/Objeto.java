class Objeto {
    private Estado estado;
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void exibirTexto() {
        System.out.println("Texto atual: " + estado.getTexto());
    }
}