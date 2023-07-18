public class Clock {
    public static void main(String[] args) {
        ClockContext clockContext = new ClockContext();
        clockContext.alert();

        clockContext.setState(new Nap());
        clockContext.alert();

        clockContext.setState(new Ringing());
        clockContext.alert();
    }
}
