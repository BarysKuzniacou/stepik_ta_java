package step_6_8_OOP_practice.Task04;

public class Musician {
    protected String name;
    public void play(){
        System.out.println(this.name + " играет на всем, до чего может дотянуться.");
    }

    public Musician(String name){
        this.name = name;
    }
}
