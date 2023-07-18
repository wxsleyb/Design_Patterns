package Flyweight;
import java.awt.Color;

class Tela {
    private Color corFundo;
    private Color corTexto;

    public Tela(String corFundo, String corTexto) {
        this.corFundo = ColorFactory.getCor(corFundo);
        this.corTexto = ColorFactory.getCor(corTexto);
    }

    public void desenhar() {
        System.out.println("Desenhando tela com cor de fundo " + corFundo + " e a cor de texto " + corTexto);
    }
}
