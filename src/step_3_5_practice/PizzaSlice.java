package step_3_5_practice;

import java.util.Scanner;

public class PizzaSlice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int slicesPerPizza = scanner.nextInt();
        int numberOfPizzas = 1;
        int numberOfSlices = slicesPerPizza;

        while (true) {
            if (numberOfPeople > numberOfSlices) {
                numberOfPizzas++;
                numberOfSlices += slicesPerPizza;
            } else if (numberOfSlices%numberOfPeople != 0) {
                numberOfPizzas++;
                numberOfSlices += slicesPerPizza;
            } else {
                break;
            }
        }
        System.out.println(numberOfPizzas);
    }
}
