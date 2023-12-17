package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει εάν θα ανάψει τα φώτα
 * ή οχι με βάση εάν βρέχει, εάν είναι σκοτεινά
 * και εάν η ταχύτητα είναι >100 χλμ.
 * Τις τιμές τις δίνει ο χρήστης από το stdin,
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int maxSpeed = 100;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true / false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = scanner.nextInt();

        lightsOn = isRaining && (isDark || speed > maxSpeed);

        System.out.printf("Lights on:" + lightsOn);

    }
}
