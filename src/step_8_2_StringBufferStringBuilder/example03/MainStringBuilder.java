package step_8_2_StringBufferStringBuilder.example03;

public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Learning ");
        updateString(str);
        System.out.println(str);
    }

    static void updateString(StringBuilder string){
        string.append("java!");
    }
}
