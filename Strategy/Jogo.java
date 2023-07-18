package Strategy;

public class Jogo {

    private Strategy strategy;

    public void setStrategy(Strategy st) {
        this.strategy = st;
    }

    public Jogo() {
        strategy = new ImpossivelStrategy();
    }

    public void jogar() {
        strategy.jogar();
    }

}
