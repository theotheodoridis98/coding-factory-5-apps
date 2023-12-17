package gr.aueb.cf.ch3;

/**
 * Ειδικές μορφές της while.
 * 0 φορές, 1 φόρα, infinite
 */
public class SpecialsWhileApp {
    public static void main(String[] args) {
        int i = 1;

        while (i < 1) {
            System.out.println("NEVER gets in");
        }

        while (i <=1) {
            System.out.println("Only ONE iteration");
        }

        while (true) {
            System.out.println("ETERNAL while loop");
        }
    }
}
