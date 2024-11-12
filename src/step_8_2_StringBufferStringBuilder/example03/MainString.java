package step_8_2_StringBufferStringBuilder.example03;

public class MainString {
    public static void main(String[] args) {
        String str = new String("Learning ");
        updateString(str);
        System.out.println(str);
    }

    static void updateString(String string){
        string += "java!";
    }
}
