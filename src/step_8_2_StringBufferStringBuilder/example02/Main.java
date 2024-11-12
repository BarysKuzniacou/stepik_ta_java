package step_8_2_StringBufferStringBuilder.example02;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder01 = new StringBuilder();
        StringBuilder stringBuilder02 = new StringBuilder("0123456789abcde12345");

        /*
        int capacity() Возвращает количество символов, для которых зарезервирована память – емкость буфера объекта.
         */
        System.out.println("Capacity 0 symbol: " + stringBuilder01.capacity());
        System.out.println("Capacity 20 symbol: " + stringBuilder02.capacity());

        /*
        void ensureCapacity(int minimumCapacity) Изменяет минимальную емкость буфера объекта.
         */
        stringBuilder01.ensureCapacity(17);
        System.out.println("0 symbol + ensureCapacity 17: " + stringBuilder01.capacity());
        stringBuilder01.ensureCapacity(34);
        System.out.println("0 symbol + ensureCapacity 34: " + stringBuilder01.capacity());
        stringBuilder01.ensureCapacity(35);
        System.out.println("0 symbol + ensureCapacity 35: " + stringBuilder01.capacity());

        /*
        void setLength(int newLength) Изменяет размер содержимого в большую/меньшую сторону:
        если новый размер больше хранящейся строки – строка будет дополнена пробелами в конце
        если новый размер меньше – строка будет усечена.
         */
        StringBuilder stringBuilder03 = new StringBuilder("0123456789abcde");

        System.out.println("Capacity 15 symbol: " + stringBuilder03.capacity());
        stringBuilder03.setLength(5);
        System.out.println(stringBuilder03);
        System.out.println("Capacity 15 symbol + setLength(5): " + stringBuilder03.capacity());
        stringBuilder03.setLength(20);
        System.out.println(stringBuilder03);
        System.out.println("Capacity 15 symbol + setLength(20): " + stringBuilder03.capacity());

        /*
        StringBuilder append(….) Добавляет подстроку (символы, значения базовых типов, массивы и строки)
        в конец StringBuffer/StringBuilder.
         */
        StringBuilder stringBuilder04 = new StringBuilder("0123456789");
        System.out.println("Capacity 10 symbol: " + stringBuilder04.capacity());
        System.out.println("10 symbol + append (abcde): " + stringBuilder04.append("abcde"));
        System.out.println("Capacity 10 symbol + append (abcde): " + stringBuilder04.capacity());

        /*
        StringBuilder insert(….) Вставляет подстроку (символы, значения базовых типов, массивы и строки)
        в указанную позицию.
         */
        StringBuilder stringBuilder05 = new StringBuilder("0123456789");
        System.out.println("10 symbol + insert (abcde) offset 1: " + stringBuilder05.insert(1, "abcde"));

        /*
        char charAt(int index) Возвращает символ с указанным индексом.
         */
        StringBuilder stringBuilder06 = new StringBuilder("0123456789");
        System.out.println("charAt(1) from 0123456789: " + stringBuilder06.charAt(1));

        /*
        StringBuilder delete(int start, int end) Удаляет подстроку, указанную позициями.
         */
        System.out.println("delete 1 to 5 from 0123456789: " + stringBuilder06.delete(1, 5));

        /*
        StringBuilder deleteCharAt(int index) Удаляет символ по указанному индексу.
         */
        StringBuilder stringBuilder07 = new StringBuilder("0123456789");
        System.out.println("deleteCharAt(1) from 0123456789: " + stringBuilder07.deleteCharAt(1));

        /*
        StringBuilder replace(int start, int end, String str) Заменяет подстроку между определенными позициями
        в StringBuffer на другую подстроку.
         */
        StringBuilder stringBuilder08 = new StringBuilder("0123456789");
        System.out.println("Replace 123 from 0123456789 for abc: " + stringBuilder08.replace(1, 4, "abc"));

        /*
        String substring(int start) String substring(int start, int end) Обрезает строку с определенного индекса до
        конца либо до определенного индекса, и возвращает в виде новой строки.
         */
        StringBuilder stringBuilder09 = new StringBuilder("0123456789");
        System.out.println("Substring 123 from 0123456789: " + stringBuilder09.substring(1, 4));

        /*
        StringBuilder reverse() Переворачивает строку символов.
         */
        StringBuilder stringBuilder10 = new StringBuilder("0123456789");
        System.out.println("Reverse 0123456789: " + stringBuilder10.reverse());
    }
}
