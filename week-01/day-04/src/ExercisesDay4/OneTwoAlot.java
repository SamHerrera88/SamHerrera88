package ExercisesDay4;
import java.util.Scanner;

public class OneTwoAlot {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        String numInStr = scanner.nextLine();
            int num = Integer.parseInt(numInStr);
                if (num <= 0) {
                    System.out.println("Not Enough" );
                } else if (num == 1) {
                    System.out.println("One");
                } else if (num ==2) {
                    System.out.println("Two");
                } else {
                    System.out.println("More Than Enough");
                }
                }
}