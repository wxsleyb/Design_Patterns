public class ScrollDecorator extends Decorator{

    public ScrollDecorator(VisualComponent decorates) {
        super(decorates);
    }



    @Override
    public void draw() {    
        super.draw();
        ScrollTo();
    }

    public void ScrollTo(){
        System.out.println("Executou o scroll");
    }
    
}
