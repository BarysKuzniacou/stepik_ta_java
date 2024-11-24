package step_8_4_practice.MainQuestion03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String strPath = scanner.nextLine();

        String rulesPathUnix = "(((~?)|(\\.{1,2}))(/?))(([\\w\\s]*(\\.{2})?/?)*)([\\w\\s]+\\.\\w+)?";
        String rulesPathWindows = "((([A-Za-z]:\\\\)?)|(\\.{1,2}))(([\\w\\s]*(\\.{2})?\\\\?)*)(([\\w\\s]+\\.\\w+)?)";

        boolean isUnixPath = Pattern.matches(rulesPathUnix, strPath);
        boolean isWindowsPath = Pattern.matches(rulesPathWindows, strPath);

        if (isUnixPath && isWindowsPath) {
            System.out.println("Both");
        } else if (isUnixPath) {
            System.out.println("Unix");
        } else if (isWindowsPath) {
            System.out.println("Windows");
        } else {
            System.out.println("Error");
        }
    }
}
