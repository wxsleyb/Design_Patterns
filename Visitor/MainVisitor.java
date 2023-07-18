package Visitor;

public class MainVisitor {
    public static void main(String[] args) {
        // Cria uma árvore binária de inteiros simples
        NoInteiro raiz = new NoInteiro(5);
        raiz.esquerda = new NoInteiro(3);
        raiz.direita = new NoInteiro(4);
        raiz.esquerda.esquerda = new NoInteiro(2);
        raiz.esquerda.direita = new NoInteiro(4);
        raiz.direita.esquerda = new NoInteiro(6);

        // Usa o SomadorVisitor para calcular a soma dos valores na árvore
        SomadorVisitor somador = new SomadorVisitor();
        raiz.accept(somador);
        int soma = somador.getSoma();

        // Imprime a soma na tela
        System.out.println("A soma dos valores na árvore é: " + soma);
    }
}