import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, provide item price: ");
        double price = scanner.nextDouble();
        System.out.print("Please, input customer age: ");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.printf("Discounted price is   %.2f", (price * 0.2));
        } else if (age > 6 && age < 18) {
            System.out.printf("Discounted price is  %.2f", (price * 0.75));
        } else if (age > 65) {
            System.out.printf("Discounted price is   %.2f", (price * 0.6));
        } else {
            System.out.printf("No discount.Price is   %.2f", (price));
        }

    }

}
