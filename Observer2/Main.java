public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        ConcreteObserver o1 = new ConcreteObserver(s);
        ConcreteObserver o2 = new ConcreteObserver(s);

        s.setState("Estado 1");
        s.setState("Estado 2");
        s.setState("Estado 3");


    
    }
    
}
