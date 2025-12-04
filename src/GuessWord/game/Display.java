package GuessWord.game;

import java.util.Scanner;

public class Display {

    public static void showWelcome() {
        System.out.println("Гра 'Вгадай слово'");
    }

    public static void showResult(String guess, String hint) {
        System.out.println(guess + " -> " + hint);
    }

    public static void showEnd(boolean win, String secret) {
        if (win) {
            System.out.println("Слово вгадано успішно.");
        } else {
            System.out.println("Спроби закінчилися. Правильне слово: " + secret);
        }
    }
}
