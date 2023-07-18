package Interpreter;

abstract class ExpressaoBinaria implements Expressao {
    protected Expressao esquerda;
    protected Expressao direita;
    
    public ExpressaoBinaria(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
}
