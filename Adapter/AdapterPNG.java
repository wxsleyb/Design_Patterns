public class AdapterPNG implements Imagem {
    private ImagemPNG imagemPNG;

    public AdapterPNG(ImagemPNG imagemPNG) {
        this.imagemPNG = imagemPNG;
    }

    public void carregar() {
        imagemPNG.carregarPNG();
    }

    public void exibir() {
        imagemPNG.exibirPNG();
    }
}