package step_7_3_interfaceJava8.example02_default;

public class Main {
    public static void main(String[] args) {
        ClassInterfaceRealize realizeInterface = new ClassInterfaceRealize();
        realizeInterface.log("realizeInterface");
        Interface01 realizeInterface01 =  new ClassInterfaceRealize();
        realizeInterface01.log("realizeInterface01");
        Interface02 realizeInterface02 =  new ClassInterfaceRealize();
        realizeInterface02.log("realizeInterface02");
    }
}
