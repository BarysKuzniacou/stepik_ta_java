package step_7_2_interface.example02;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.call();

        Call client2 = new Client();
        client2.call();

        Base client3 = new Base();
        client3.call();

    }
}
