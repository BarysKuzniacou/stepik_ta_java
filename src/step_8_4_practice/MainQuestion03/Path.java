package step_8_4_practice.MainQuestion03;

import java.util.regex.Pattern;

public class Path {
    public String pathNotation(String strPath) {
        String rulesPathUnix = "";
        String rulesPathWindows = "";


        Pattern patternUnix = Pattern.compile(rulesPathUnix);
        Pattern patternWindows = Pattern.compile(rulesPathWindows);

        boolean isUnixPath = Pattern.matches(rulesPathUnix,strPath);
        boolean isWindowsPath = Pattern.matches(rulesPathWindows,strPath);

        if (isUnixPath) {
            if (isWindowsPath) {
                return "Both";
            }
            return "Unix";
        } else if (isWindowsPath) {
            return "Windows";
        } else {
            return "Error";
        }
    }
}
