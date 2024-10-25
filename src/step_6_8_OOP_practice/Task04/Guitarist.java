package step_6_8_OOP_practice.Task04;

public class Guitarist extends Musician {
    public Guitarist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на гитаре.");
    }
}
