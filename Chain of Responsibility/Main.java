

public class Main {
    public static void main(String[] args) {
        Handler primeiroHandler = new FirstHandler();
        Handler segundoHandler = new SecondHandler();
        Handler defaultHandler = new DefaultHandler();

        primeiroHandler.setNext(segundoHandler);
        segundoHandler.setNext(defaultHandler);

        // Executa a cadeia de responsabilidade com diferentes requisições
        primeiroHandler.handle("Esta é a primeira requisição.");
        segundoHandler.handle("Esta é a segunda requisição.");
        defaultHandler.handle("Esta é a terceira requisição.");
    }
}
