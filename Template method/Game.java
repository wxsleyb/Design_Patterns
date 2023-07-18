abstract class Game {
    protected int playersCount;

    abstract void initializeGame();
    abstract void playGame();
    abstract void endGame();

    public final void play() {
        initializeGame();
        playGame();
        endGame();
    }
}