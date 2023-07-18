public class Main {

    public static void main(String[] args) {
        ImageView iv = new ImageView();
        ScrollDecorator sd = new ScrollDecorator(iv);
        BorderDecorator bd = new BorderDecorator(sd);
        bd.draw();
        
    }
    
}
