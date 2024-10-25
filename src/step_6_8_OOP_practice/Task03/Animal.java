package step_6_8_OOP_practice.Task03;

class Animal {
    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " говорит " + this.voice);
    }
}
