public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        Observer o1 = new ConcreteObserver(s);
        Observer o2 = new ConcreteObserver(s);

        s.setState("Estado 1");
        s.setState("Estado 2");
        s.setState("Estado 3");


    
    }
    
}
