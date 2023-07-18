import java.util.Observable;
import java.util.Observer;


public class ConcreteObserver implements Observer {

    private ConcreteSubject cs;

    public ConcreteObserver(ConcreteSubject cs){
        this.cs = cs;
        cs.addObserver(this);
    }


    public void update(Observable o, Object arg){
        System.out.println("Observer notificado - Estado: "+cs.getState());
    }

    
    
}
