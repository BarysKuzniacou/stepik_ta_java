package step_8_4_practice.MainQuestion03;

import java.util.regex.Pattern;

public class PathDetector {

    public String detectPathNotation(String strPath) {
        String rulesPathUnix = "^(~|\\.|\\.\\.|/)?(/[\\w\\s-]+)*/?([\\w\\s-]+(\\.[\\w]+)?)?$";
        String rulesPathWindows = "^([A-Za-z]:\\\\)?([\\w\\s-]+\\\\)*([\\w\\s-]+(\\.[\\w]+)?)?$|^(\\\\?\\.\\\\?)(\\\\[\\w\\s-]+)*$";

        boolean isUnixPath = Pattern.matches(rulesPathUnix, strPath);
        boolean isWindowsPath = Pattern.matches(rulesPathWindows, strPath);

        if (isUnixPath && isWindowsPath) {
            return "Both";
        } else if (isUnixPath) {
            return "Unix";
        } else if (isWindowsPath) {
            return "Windows";
        } else {
            return "Error";
        }
    }
}