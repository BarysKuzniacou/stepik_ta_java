package step_5_4;

public class Main {
    public static void adopt(Cat cat) {
        System.out.println("Old value of \"collarStatus\" in \"adopt\" method is:" + cat.isCollarStatus());
        cat.setCollarStatus(true);
        System.out.println("New value of \"collarStatus\" in \"adopt\" method is:" + cat.isCollarStatus());
    }
    public static void main(String[] args) {
        Cat kitty = new Cat();
        System.out.println("Old value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus());
        adopt(kitty);
        System.out.println("New value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus());
    }
}
