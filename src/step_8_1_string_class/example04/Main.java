package step_8_1_string_class.example04;

public class Main {
    public static void main(String[] args) {
        /*
        Когда нужно извлечь одновременно массив символов, необходимо использовать метод
        getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin), где:

        srcBegin – первый индекс в строке, необходим для начала извлечения символов
        srcEnd – последний индекс в строке, до которого будут извлекаться символы
        dst – массив, в который будут помещены извлеченные символы
        dstBegin – индекс в массиве dst, начиная с которого нужно добавить извлеченные из строки символы.
         */
        String str = "Software And Hardware!";
        int start = 9;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }
}
