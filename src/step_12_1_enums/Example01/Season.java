package step_12_1_enums.Example01;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    @Override
    public String toString() {
        return "Season: " + super.toString();
    }
}
