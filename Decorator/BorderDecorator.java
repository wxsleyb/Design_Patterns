public class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent decorates) {
        super(decorates);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    public void drawBorder(){
        System.out.println("Desenhou a borda da imagem");
    }
 
}
