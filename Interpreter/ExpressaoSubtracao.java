package Interpreter;

class ExpressaoSubtracao extends ExpressaoBinaria {
    public ExpressaoSubtracao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }
    
    public int avaliar() {
        return esquerda.avaliar() - direita.avaliar();
    }
}
