package step_7_3_interfaceJava8.example03_static;

public class Main {
    public static void main(String[] args) {
        System.out.println("Class");
        ClassData obj = new ClassData();
        obj.print(""); // interface
        obj.isNull("abc"); // class
        System.out.println("Interface");
        InterfaceData objInt = new ClassData();
        objInt.print(""); // interface
        //objInt.isNull("abc"); - ???
        /*
        В коде, который вы привели, метод isNull(String str) определён в интерфейсе InterfaceData как статический метод.
        В Java статические методы интерфейса не наследуются классами, реализующими этот интерфейс, и не могут быть
        вызваны через переменную экземпляра интерфейса.

        Почему нельзя вызвать objInt.isNull("abc")?
        Метод isNull в интерфейсе InterfaceData объявлен как static, а в Java статические методы принадлежат самому
        интерфейсу, а не экземплярам, которые его реализуют. Таким образом:

        Статические методы интерфейса вызываются только по имени интерфейса.
        Вызвать isNull через объект objInt, который является экземпляром ClassData, нельзя, так как это противоречит
        принципам Java.
         */
    }
}
