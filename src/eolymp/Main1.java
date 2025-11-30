package eolymp;
import java.util.Scanner;

public class Main1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                int p = 2 * (n + m);
                int a = n * m;
                System.out.println(p + " " + a);
            }
        }
}
