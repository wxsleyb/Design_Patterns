package Strategy;

public class Player {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.jogar();

        jogo.setStrategy(new FacilStrategy());
        jogo.jogar();
    }
    
}
