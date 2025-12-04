package GameMontyHall.game;

public class UI {
    public void showHostDoor(int door) {
        System.out.println("Ведучий відкрив двері №" + door + " (порожньо).");
    }

    public void showResult(boolean win, int prizeDoor) {
        if (win) {
            System.out.println("Ви виграли! Приз за дверима №" + prizeDoor);
        } else {
            System.out.println("Ви програли. Приз був за дверима №" + prizeDoor);
        }
    }
}
