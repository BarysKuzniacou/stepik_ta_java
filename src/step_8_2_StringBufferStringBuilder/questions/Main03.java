package step_8_2_StringBufferStringBuilder.questions;

public class Main03 {
    public static void main(String[] args) {
        char[] name = new char[] {'P','a','u','l'};
        String boy = new String(name); //1
        StringBuilder sd1 = new StringBuilder("String Builder");
        String str5 = new String(sd1);  //2
        StringBuffer sb2 = new StringBuffer("String Buffer");
        String str6 = new String(sb2);  //3
        String empName = null; //4
    }
}
