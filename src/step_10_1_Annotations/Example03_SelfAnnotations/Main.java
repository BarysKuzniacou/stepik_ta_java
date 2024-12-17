package step_10_1_Annotations.Example03_SelfAnnotations;

public class Main {
    /*
    @Retention - указывает, как долго должна храниться аннотация.

    @Target - указывает, к каким элементам может применяться аннотация.

    @Inherited - указывает, применять ли автоматически созданную аннотацию к классам наследникам.

    @Documented - указывает, нужно ли сохранять информацию о применении аннотации во время работы приложения в
    автогенерируемой документации.

    Ниже в примере определена аннотация TestClass, которой можно помечать классы — @Target(ElementType.TYPE).
    Информация о пометке этой аннотацией останется в Javadoc помеченного класса @Documented, а также будет доступна во
    время выполнения — @Retention(RetentionPolicy.RUNTIME). Все наследники помеченного класса будут также считаться
    помеченными ею.

    @Target(ElementType.TYPE)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @interface TestClass {
    }
     */
}
