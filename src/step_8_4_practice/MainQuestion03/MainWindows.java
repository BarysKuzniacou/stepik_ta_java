package step_8_4_practice.MainQuestion03;

public class MainWindows {
    public static void main(String[] args) {
        String regex = "^(?:(?:[a-zA-Z]:\\\\(?:[^\\\\\\s]+\\\\?)*)|\\.\\.|\\.\\.(?:\\\\(?:[^\\\\\\s]+\\\\?)*)?|(?:[^\\\\\\s]+\\\\?)*[^\\\\\\s]+|\\\\[^\\s]*)$";

        String[] paths = {
                "C:\\User\\secret\\dont_look.txt",
                ".",
                "C:\\User",
                "C:\\User\\",
                "..",
                "C:\\",
                "..\\anoTHER_folder",
                "..\\anoTHER_folder\\",
                "..\\folder name",
                "dir\\subdir\\wrongsubdir\\..\\rightdir",
                "C:\\root\\logs\\end.log"
        };

        for (String path : paths) {
            System.out.println(path + " : " + path.matches(regex));
        }
    }
}