package step_7_4_cloning.question02;

public class Main {
    public static void main(String[] arg) throws Exception {
        CatNew myCat = new CatNew(5, "Chita");
        CatNew copyCat = (CatNew) myCat.clone();
        System.out.println(copyCat);
    }
}
