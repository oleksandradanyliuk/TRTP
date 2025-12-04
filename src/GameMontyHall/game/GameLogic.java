package GameMontyHall.game;

import java.util.Random;

public class GameLogic {
    private int prizeDoor;
    private int playerChoice;
    private int openedDoor;

    public GameLogic() {
        Random rand = new Random();
        prizeDoor = rand.nextInt(3) + 1; // Двері 1-3
    }

    public void setPlayerChoice(int choice) {
        this.playerChoice = choice;
    }

    public int getPrizeDoor() {
        return prizeDoor;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public int getOpenedDoor() {
        return openedDoor;
    }

    public void hostOpensDoor() {
        Random rand = new Random();
        int doorToOpen;
        do {
            doorToOpen = rand.nextInt(3) + 1;
        } while (doorToOpen == playerChoice || doorToOpen == prizeDoor);
        openedDoor = doorToOpen;
    }

    public boolean checkWin(int finalChoice) {
        return finalChoice == prizeDoor;
    }


    public int switchChoice() {
        for (int i = 1; i <= 3; i++) {
            if (i != playerChoice && i != openedDoor) {
                playerChoice = i;
                break;
            }
        }
        return playerChoice;
    }
}

