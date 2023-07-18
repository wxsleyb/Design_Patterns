package Flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        Tela tela1 = new Tela("vermelho", "azul");
        tela1.desenhar();

        Tela tela2 = new Tela("verde", "azul");
        tela2.desenhar();

        Tela tela3 = new Tela("vermelho", "azul");
        tela3.desenhar();
    }
}
