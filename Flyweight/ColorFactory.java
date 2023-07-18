package Flyweight;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
class ColorFactory {
    private static final Map<String, Color> cores = new HashMap<>();

    public static Color getCor(String nome) {
        Color cor = cores.get(nome);

        // Se a cor ainda não foi criada, cria e armazena na tabela de cores
        if (cor == null) {
            switch (nome) {
                case "vermelho":
                    cor = new Color(255, 0, 0);
                    break;
                case "verde":
                    cor = new Color(0, 255, 0);
                    break;
                case "azul":
                    cor = new Color(0, 0, 255);
                    break;
                default:
                    cor = new Color(0, 0, 0);
                    break;
            }
            cores.put(nome, cor);
        }

        return cor;
    }
}