package Visitor;

class SomadorVisitor implements Visitor {
    private int soma;

    public SomadorVisitor() {
        this.soma = 0;
    }

    public void visit(NoInteiro no) {
        this.soma += no.valor;
        if (no.esquerda != null) {
            no.esquerda.accept(this);
        }
        if (no.direita != null) {
            no.direita.accept(this);
        }
    }

    public int getSoma() {
        return this.soma;
    }
}
