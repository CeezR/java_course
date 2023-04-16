package chapter14;

public class Player {
    private String name;
    private String guess;
    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGuess() {
        return guess;
    }
    public boolean setGuess(String guess) {
        if(!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)) {
            System.out.println("Guess must be Heads or Tails");
            return false;
        }
        else {
            this.guess = guess;
            return true;
        }
    }

}
