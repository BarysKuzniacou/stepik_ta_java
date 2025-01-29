package step_12_1_enums.Questions.Question02;

public class Main {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;  //Строка1
        if (n1 == n2) {
            System.out.print ("true");
        } else {
            System.out.print ("false");
        }
        System.out.println(Numbers.FIVE.ordinal());  //Строка2
    }
}
