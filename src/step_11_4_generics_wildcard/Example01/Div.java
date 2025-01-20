package step_11_4_generics_wildcard.Example01;

class Div<T extends Number> {
    private T x;
    private T y;

    Div(T a, T b) {
        x = a;
        y = b;
    }

    public int perform() {
        return (int) (x.doubleValue() / y.doubleValue());
    }

    /*
    Подстановочный тип можно использовать с границами, чтобы ослабить ограничения на переменную и очертить группу типов, которые могут использоваться:

    <? extends SuperClass> – верхняя граница: означает, что может быть любой тип, но из подтипа SuperClass или он сам
    <? super SubClass> – нижняя граница: означает, что может быть любой тип, но из супертипов SubClass или он сам.
     */

    /*
    public boolean equalsDiv(Div<?> data) {
        return this.perform() == data.perform();
    }
     */

    public boolean equalsDiv(Div<? extends Number> data) {
        return this.perform() == data.perform();
    }
}
