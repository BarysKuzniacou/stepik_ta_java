package step_12_1_enums.Example03_methods;

public enum SeasonWD {
    WINTER {
        public String toString() { return "Winter - cold season"; }
    },
    SPRING {
        public String toString() { return "Spring - cold-warm season"; }
    },
    SUMMER {
        public String toString() { return "Summer - hot season"; }
    },
    AUTUMN {
        public String toString() { return "Auturn - cool season"; }
    }
}
