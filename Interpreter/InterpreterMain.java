package Interpreter;

public class InterpreterMain {
    public static void main(String[] args) {
        Expressao dois = new Numero(2);
        Expressao tres = new Numero(3);
        Expressao quatro = new Numero(4);
        Expressao seis = new Numero(6);
        Expressao media = new ExpressaoMedia(quatro, seis);

        // Cria as expressões correspondentes à soma, subtração e média
        Expressao soma = new ExpressaoSoma(dois, tres);
        Expressao subtracao = new ExpressaoSubtracao(soma, media);

        int resultadoSoma = soma.avaliar();
        int resultadoSubtracao = subtracao.avaliar();
        System.out.println("Resultado da soma: "+ resultadoSoma);
        System.out.println("Resultado da subtracao: "+ resultadoSubtracao);

    }
}
