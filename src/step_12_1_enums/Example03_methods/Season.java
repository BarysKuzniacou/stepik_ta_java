package step_12_1_enums.Example03_methods;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;
    public String toString(){
        return "S_e_a_s_o_n: " + this.name();
    }
}
