package step_3_3_selection_operator;

public class MainClassQuestions {
    public static void main(String[] args) {

        String day = new String("SAT");
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
                break;
            case "FRI":
                System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }
    }
}
