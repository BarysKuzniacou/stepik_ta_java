package step_12_1_enums.Example02_enum_methods_realisation;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    @Override
    public String toString() {
        return "Season: " + super.toString();
    }
}
