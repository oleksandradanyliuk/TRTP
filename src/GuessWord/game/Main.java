package GuessWord.game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Display.showWelcome();
        Scanner sc = new Scanner(System.in);

        String secret = Logic.chooseWord();
        int attempts = 6;

        for (int i = 0; i < attempts; i++) {
            System.out.print("Введіть слово: ");
            String guess = sc.nextLine().trim().toLowerCase();

            if (guess.length() != secret.length()) {
                System.out.println("Довжина слова неправильна.");
                i--;
                continue;
            }

            String hint = Logic.checkGuess(secret, guess);
            Display.showResult(guess, hint);

            if (guess.equals(secret)) {
                Display.showEnd(true, secret);
                return;
            }
        }

        Display.showEnd(false, secret);
    }
}
