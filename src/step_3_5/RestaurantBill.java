package step_3_5;

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bill = scanner.nextInt();
        int diners = scanner.nextInt();
        final int GRATUITY_AMMOUNT = 10;

        if (bill < 0) {
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        } else if (diners <= 0) {
            System.out.println("Кто здесь?!");
        } else {
            int totalBill = bill + (bill * GRATUITY_AMMOUNT / 100);
            int personBill = totalBill / diners;
            System.out.println(personBill);
        }
    }
}
