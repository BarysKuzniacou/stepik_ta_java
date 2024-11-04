package step_7_4_cloning.question01;

import step_7_4_cloning.question02.CatNew;

public class Main {
    public static void main(String[] arg) throws Exception {
        CatNew cat = new CatNew(5, "Chita");
        System.out.println(cat);
        CatNew copyCat = (CatNew) cat.clone();
        System.out.println(copyCat);
    }
}
