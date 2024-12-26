package step_11_1_generics.Example01;

public class Demo01 {
    public static void main(String[] arg) {
        DynamicArray<Integer> dynArray = new DynamicArray<>();
        dynArray.addElement( Integer.valueOf(10));
        Integer xx = dynArray.getElement(0);
        dynArray.addElement(Integer.valueOf("Java")); //изменено для компиляции dynArray.addElement("Java")
        Integer yy = dynArray.getElement(1);
    }
}
