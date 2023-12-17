package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.lang.Math;
/**
 * Λαμβάνει ένα ακέραιο απο το stdin
 * και εκτυπώνει το τετράγωνο και τον κύβο.
 */
public class MathPowersApp {
    public static void main(String[] args) {
        int num1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert an integer");
        num1 = scanner.nextInt();

        System.out.printf("num = %d, nun^2 = %d, num^ = %d"
                , num1 , (int) Math.pow(num1,2) , (int) Math.pow(num1,3) );
    }
}
