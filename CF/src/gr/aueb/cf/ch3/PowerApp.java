package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το α^ν με while Πχ
 * το 2 ^ 10 = 1024
 * το 3 ^ 3 = 27
 */
public class PowerApp {
    public static void main(String[] args) {
        int baseNum = 0;
        int powerNum = 0;
        int i = 1;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert base number.");
        baseNum = scanner.nextInt();

        System.out.println("Please insert power number.");
        powerNum = scanner.nextInt();

        while (i <= powerNum) {
            result *= baseNum;
            i++;
        }
        System.out.println("The result is:" + result);

    }
}
