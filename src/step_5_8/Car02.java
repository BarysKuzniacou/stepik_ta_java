package step_5_8;

public class Car02 {
    private static int numOfCars;

    {
        numOfCars++;
    }

    public Car02() {
        System.out.println("car - 1");
    }
    public Car02(String model) {
        System.out.println("car - 2");
    }

    public static void main(String[] args) {
        Car02 car1 = new Car02();
        Car02 car2 = new Car02("Toyota");
        System.out.println("Main method " + numOfCars);
    }
}
