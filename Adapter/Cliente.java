public class Cliente {
    public static void main(String[] args) {
        ImagemPNG imagemPNG = new ImagemPNG();
        Imagem imagem1 = new AdapterPNG(imagemPNG);
        imagem1.carregar();
        imagem1.exibir();
    }
}
