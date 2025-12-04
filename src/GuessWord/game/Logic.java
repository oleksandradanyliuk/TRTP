package GuessWord.game;

import java.util.Random;

public class Logic {

    public static String chooseWord() {
        Random random = new Random();
        return Words.WORDS.get(random.nextInt(Words.WORDS.size()));
    }

    public static String checkGuess(String secret, String guess) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < secret.length(); i++) {
            char g = guess.charAt(i);

            if (g == secret.charAt(i)) {
                result.append("Correct ");
            } else if (secret.indexOf(g) != -1) {
                result.append("Present ");
            } else {
                result.append("Absent ");
            }
        }
        return result.toString().trim();
    }
}
