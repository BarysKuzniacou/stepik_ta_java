package step_12_1_enums.Example03_methods;

public class Main {
    public static void main(String[] args) {
        for (DocumentStatus docSt : DocumentStatus.values()) {
            System.out.println("Name = " + docSt.name() +
                    ", statusCode is = " + docSt.getStatusCode() );
        }

        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
        System.out.println(Season.AUTUMN);

        System.out.println(SeasonWD.SPRING);
        System.out.println(SeasonWD.SUMMER);
        System.out.println(SeasonWD.WINTER);
        System.out.println(SeasonWD.AUTUMN);
    }
}
