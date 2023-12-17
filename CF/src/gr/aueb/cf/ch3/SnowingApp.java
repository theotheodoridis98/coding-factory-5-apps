package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μία θερμοκρασία και ένα
 * boolean για το αν βρέχει απο το stdin
 * και αποφασίζει εάν χιονίζει.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert temp.");
        temp = scanner.nextInt();
        System.out.println("Please insert if it is raining. (true / false)");
        isRaining = scanner.nextBoolean();

        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
