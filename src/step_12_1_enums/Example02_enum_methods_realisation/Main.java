package step_12_1_enums.Example02_enum_methods_realisation;

import step_12_1_enums.Example01.Season;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println(step_12_1_enums.Example01.Season.SUMMER.name());
        System.out.println(step_12_1_enums.Example01.Season.SUMMER.ordinal());

        // реализация values
        step_12_1_enums.Example01.Season[] seasons = step_12_1_enums.Example01.Season.values();
        System.out.println(Arrays.toString(seasons));

        // реализация valuesOf
        System.out.println(step_12_1_enums.Example01.Season.valueOf("SUMMER"));
        System.out.println(step_12_1_enums.Example01.Season.valueOf("SUMMER").ordinal());

        // реализация compareTo
        /*
        отрицательное целое, если константа-значение следует перед переданным в метод параметром (также
        константой-значением)

        0 — если константа-значение равна переданному в метод параметру (иначе говоря, this == other)

        в остальных случаях — положительное целое, если константа-значение следует после переданного в метод
        параметра.
         */
        System.out.println(step_12_1_enums.Example01.Season.SPRING.compareTo(step_12_1_enums.Example01.Season.WINTER));
        System.out.println(step_12_1_enums.Example01.Season.SPRING.compareTo(step_12_1_enums.Example01.Season.SPRING));
        System.out.println(step_12_1_enums.Example01.Season.SPRING.compareTo(step_12_1_enums.Example01.Season.SUMMER));
        System.out.println(step_12_1_enums.Example01.Season.WINTER.compareTo(step_12_1_enums.Example01.Season.SUMMER));

        //реализация equals
        step_12_1_enums.Example01.Season season04 = step_12_1_enums.Example01.Season.WINTER;
        step_12_1_enums.Example01.Season season05 = step_12_1_enums.Example01.Season.WINTER;
        System.out.println(season04 == step_12_1_enums.Example01.Season.WINTER);
        System.out.println(season04 == step_12_1_enums.Example01.Season.SUMMER);
        System.out.println(season04 == season05);

        // hashCode
        int hashOfWinter01 = step_12_1_enums.Example01.Season.WINTER.hashCode();
        int hashOfWinter02 = step_12_1_enums.Example01.Season.WINTER.hashCode();
        int hashOfSummer = step_12_1_enums.Example01.Season.SUMMER.hashCode();
        System.out.println(hashOfWinter01);
        System.out.println(hashOfWinter02);
        System.out.println(hashOfSummer);

        //toString
        String winter = Season.WINTER.toString();
        System.out.println(winter);
    }
}
