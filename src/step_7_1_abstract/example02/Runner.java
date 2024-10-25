package step_7_1_abstract.example02;

public class Runner {
    public static void main(String[] args) {
        GraphicObject mng;
        // mng = new GraphicObject();
        // нельзя создать объект!
        mng = new Circle();
        System.out.println(mng.num);
        mng.draw();
        mng.moveTo(10, 10);
    }
}
