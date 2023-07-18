class Xadrez extends Game {
    @Override
    void initializeGame() {
        playersCount = 2;
        System.out.println("Jogo de xadrez inicializado com " + playersCount + " jogadores.");
    }

    @Override
    void playGame() {
        System.out.println("Jogando Xadrez...");
    }

    @Override
    void endGame() {
        System.out.println("Jogo de xadrez acabou.");
    }


}
