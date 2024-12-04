package step_9_2_exception_handling;

public class TestFinally {
    static void procA() {
        try {
            System.out.println("Method procA()");
            return;
        } finally {
            System.out.println("Block finally of method procA()");
        }
    }
    static int procB() {
        try {
            System.out.println("Method procB()");
            return  1;
        } finally {
            System.out.println("Block finally of method procB()");
            return  0;
        }
    }
    public static void main(String [] args) {
        procA();
        System.out.println(procB());
    }
}
