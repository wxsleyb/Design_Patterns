

abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNext() {
        return nextHandler;
    }
}
