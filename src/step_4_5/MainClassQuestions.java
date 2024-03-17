package step_4_5;

import java.util.Arrays;

/*
toString(array) —преобразование массива в строку символов
deepToString(array) — преобразование многомерного массива в строку символов
copyOf(array, length) — копирование массива указанной длины
equals(array1, array2) — сравнение массивов
deepEquals(array1, array2) — сравнение многомерных массивов
sort(array) — расположение элементов массива в порядке не убывания
binarySearch(array, element) — определение содержит ли массив значение element: если да, то возвращает его индекс
fill(array, element) — заполнение элементов массива значением element.

int[] array1 = {1, 2, 3, 4};
int[] array2 = {5, 6, 7, 8, 9, 10, 11, 12};
System.arraycopy(array1, 0, array2, 1, 3);
 */

public class MainClassQuestions {
    public static void main (String[] args) {
        question1();
        question2();
        question3();
        testMethod();
    }
    private static void question1() {
        int[] array = new int[] {3, 4, 2, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void question2() {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
    }

    private static void question3() {
        int size = 4;
        int[] testArr = new int [size];
        Arrays.fill(testArr, 1);
        System.out.println(Arrays.toString(testArr));
    }

    private static void testMethod() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.arraycopy(array1, 0, array2, 1, 3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
