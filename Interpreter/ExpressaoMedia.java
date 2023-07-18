package Interpreter;

class ExpressaoMedia extends ExpressaoBinaria {
    public ExpressaoMedia(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }
    
    public int avaliar() {
        return (esquerda.avaliar() + direita.avaliar()) / 2;
    }
}
