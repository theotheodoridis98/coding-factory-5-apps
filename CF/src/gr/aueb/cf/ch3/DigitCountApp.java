package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των ψηφίων ενός
 * ακεραίου που δίνει ο χρήστης.
 */
public class DigitCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int inputNumber = 0;
        int num = 0;
        int count = 0;

        System.out.println("Please insert num");
        inputNumber = scanner.nextInt();

        num = inputNumber;
        do {
            count ++;
            num /= 10;
        }while (num != 0);

        System.out.println("Digit count:" + count);
    }
}
