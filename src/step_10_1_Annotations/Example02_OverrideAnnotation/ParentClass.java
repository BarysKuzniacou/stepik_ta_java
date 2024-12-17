package step_10_1_Annotations.Example02_OverrideAnnotation;

public class ParentClass {
    public void printHello() {
        System.out.println("Hello ParentClass");
    }

    @Deprecated
    public void sayPff() {
        System.out.println("Pff from ParentClass");
    }

    /*
    @SupressWarnings - подавляет выведение предупреждений компилятора в помеченном методе.

    @SafeVarargs - в специфических случаях совмещения переменного числа аргументов и параметризации подавляет связанное
    с этим предупреждение компилятора.

    @FunctionalInterface - помечает интерфейс как функциональный. Это говорит о том, что предпочтительный способ его
    реализации – использование лямбды.
     */
    @SupressWarnings
    public void sayWowWow() {
        System.out.println("Wow Wow from ParentClass");
    }
}
