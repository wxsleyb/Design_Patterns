package Interpreter;

class Numero implements Expressao {
    private int valor;
    
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public int avaliar() {
        return valor;
    }
}