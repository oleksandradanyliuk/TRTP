package GameMontyHall.game;
import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);

    public int chooseDoor() {
        System.out.print("Оберіть двері (1-3): ");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.print("Невірний вибір. Введіть число від 1 до 3: ");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public boolean decideSwitch() {
        System.out.print("Бажаєте змінити двері? (y/n): ");
        String answer = scanner.next().toLowerCase();
        return answer.equals("y");
    }
}
