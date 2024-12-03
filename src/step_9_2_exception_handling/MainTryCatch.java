package step_9_2_exception_handling;

public class MainTryCatch {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6};

        try {
            int sum = 0;
            for (int i = 0; i <= Array.length; i++) {
                sum += Array[i];
            }
            System.out.println("Sum: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Program finish!");
    }
}
