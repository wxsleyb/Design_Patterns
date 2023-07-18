package Visitor;

class NoInteiro {
    int valor;
    NoInteiro esquerda;
    NoInteiro direita;

    public NoInteiro(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

