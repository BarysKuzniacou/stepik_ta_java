package step_6_8_OOP_practice.Task04;

public class Main {
    public static void main(String args[]) {

        Guitarist ritchie = new Guitarist("Ричард");
        Keyboardist john = new Keyboardist("Джон");
        Musician david = new Musician("Давид");

        Musician[] musicians = {ritchie, john, david};

        for (Musician m : musicians){
            m.play();
        }
    }
}
