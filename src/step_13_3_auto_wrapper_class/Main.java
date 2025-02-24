package step_13_3_auto_wrapper_class;

public class Main {
    public static void main(String[] args) {
        Integer intObject01 = 200;
        Integer intObject02 = Integer.valueOf(200);
        System.out.println(intObject01 + intObject02);

        int intA = intObject01;
        System.out.println(intA);

        //-----------------------------------------------
        Integer ten = 10;
        Integer copyOfTen = 10;
        Integer twelve = 12;
        System.out.println(ten == copyOfTen);
        System.out.println(ten.equals(copyOfTen));
        System.out.println(ten == twelve);
        System.out.println(ten == (twelve - 2));

        Integer thousand = 1000;
        Integer copyOfThousand = 1000;
        System.out.println(thousand == copyOfThousand);
        System.out.println(thousand.equals(copyOfThousand));

        //-----------------------------------------------
        ten = ten - 2;
        System.out.println(ten);

        //-----------------------------------------------
        Integer y = 567;
        Integer x = y;
        System.out.print((x == y) + " ");
        x++;
        y++;
        System.out.print(x == y);
    }
}
