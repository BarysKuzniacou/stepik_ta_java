package step_6_5_polymorphism.information_02.CatPackage;

public class Main {
    public static void main(String[] args) {
        Cat cat = new BritishCat();
        cat.move();
        BritishCat cat2 = (BritishCat) cat;
        cat2.move();
        //PersianCat cat3 = (PersianCat) cat;
        /*
        java.lang.ClassCastException
         */
        if (cat instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) cat;
        } else {
            System.out.println("Not Persian cat!");
        }
    }
}
