package step_6_8_OOP_practice.Task04;

public class Keyboardist extends Musician {
    public Keyboardist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на фортепиано.");
    }
}
