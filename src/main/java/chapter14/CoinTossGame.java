package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Coin coin = new Coin();

        Scanner input = new Scanner(System.in);
        System.out.println("Player 1, please enter your guess: "); // loop until player 1's guess is valid
        while(!player1.setGuess(input.nextLine()));
        player2.setGuess(Coin.getOpposite(player1.getGuess()));
        coin.flip();
        CheckWinner(player1.getGuess(), player2.getGuess(), coin.getSide());


    }

    private static void CheckWinner(String player1Guess, String player2Guess, String coinSide) {
        System.out.println("Player 1 guessed: " + player1Guess);
        System.out.println("Player 2 guessed: " + player2Guess);
        System.out.println("The coin landed on: " + coinSide);
        if (player1Guess.equalsIgnoreCase(coinSide)) {
            System.out.println("Player 1 wins!");
        } else if (player2Guess.equalsIgnoreCase(coinSide)) {
            System.out.println("Player 2 wins!");
        }
    }
}
