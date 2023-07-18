public class ClockContext {
    private ClockAlertState currentState;

    public ClockContext(){
        currentState = new Ringing();
        
    }

    public void setState(ClockAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert();
    }

   
}
