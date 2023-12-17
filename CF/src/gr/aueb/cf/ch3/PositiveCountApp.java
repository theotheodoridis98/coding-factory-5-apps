package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Όσο ο χρήστης δίνει θετικούς
 * ακεραίους, τους προσμετράμε μέχρι
 * ο χρήστης να δώσει αρνητικό
 * (sentinel value)
 */
public class PositiveCountApp {
    public static void main(String[] args) {
        int inputNum = 0;
        int positives = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number (negative for Quit)");
        inputNum = scanner.nextInt();

        while (inputNum >= 0) {
            positives++;
            System.out.println("Please insert a number (negative for Quit)");
            inputNum = scanner.nextInt();
        }
        System.out.println("Positives Count: " + positives);
    }
}
