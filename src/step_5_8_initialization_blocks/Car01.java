package step_5_8_initialization_blocks;

public class Car01 {
    private static int numOfCars;

    public Car01() {
        System.out.println("car - 1");
        numOfCars++;
    }
    public Car01(String model) {
        System.out.println("car - 2");
        numOfCars++;
    }

    public static void main(String[] args) {
        Car01 car1 = new Car01();
        Car01 car2 = new Car01("Toyota");
        System.out.println("Main method " + numOfCars);
    }
}


