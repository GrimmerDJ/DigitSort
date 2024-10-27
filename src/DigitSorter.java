import java.util.Scanner;

public class DigitSorter {

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double min = Math.min(num1, Math.min(num2, num3));
        double max = Math.max(num1, Math.max(num2, num3));
        double mid = num1 + num2 + num3 - min - max;

        System.out.println("The numbers in increasing order are: " + min + ", " + mid + ", " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        scanner.close();
    }
}