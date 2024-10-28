package step_7_2_interface.example02;

public class Client extends Base implements Call{
    public void call() {
        System.out.println("Client");
        super.call();
    }
}
