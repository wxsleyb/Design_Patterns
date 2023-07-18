package Interpreter;

class ExpressaoSoma extends ExpressaoBinaria {
    public ExpressaoSoma(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }
    
    public int avaliar() {
        return esquerda.avaliar() + direita.avaliar();
    }
}

