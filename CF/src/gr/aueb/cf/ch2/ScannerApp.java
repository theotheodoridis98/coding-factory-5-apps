package gr.aueb.cf.ch2;
import java.util.Scanner;
public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Please insert two ints.");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }
}
