package chapter4d;

import java.util.Random;

public class RollTheDie {
    private static final int GAME_BOARD_SPACES = 20;
    private static final int MAXIMUM_DICEROLES = 5;
    public static void main(String[] args) {
        int currentBoardPosition = 1;
        int currentDiceRoll = 1;

        while (currentDiceRoll <= MAXIMUM_DICEROLES && currentBoardPosition != GAME_BOARD_SPACES)
        {

            Random random = new Random();
            int dice = random.nextInt(1, 7);
            currentBoardPosition += dice;

            String rollMessage;
            if(currentBoardPosition >= GAME_BOARD_SPACES) {
                currentBoardPosition = 20;
                rollMessage = String.format("Roll #%s: You've rolled a %s. You're on space %s. Congrats, you win!",
                        currentDiceRoll, dice, currentBoardPosition);
            } else {
                rollMessage = String.format("Roll #%s: You've rolled a %s. You are now on space %s and have %s more to go.",
                        currentDiceRoll, dice, currentBoardPosition, GAME_BOARD_SPACES - currentBoardPosition);
            }
            System.out.println(rollMessage);
            currentDiceRoll++;

        }


    }

}
