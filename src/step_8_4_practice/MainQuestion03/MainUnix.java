package step_8_4_practice.MainQuestion03;

public class MainUnix {
    public static void main(String[] args) {
        String regex = "^(~(?:/[^/\\s]+)*/?|\\.\\.|\\.\\./(?:[^/\\s]+(?:\\s[^/\\s]+)*/?)?|(?:[^/\\s]+(?:\\s[^/\\s]+)*/?)*[^/\\s]+|/[^\\s]*)$";
        
        String[] paths = {
            "~/secret/dont_look.txt",
            ".",
            "~",
            "~/",
            "..",
            "/",
            "../anoTHER_folder",
            "../anoTHER_folder/",
            "../folder name",
            "dir/subdir/wrongsubdir/../rightdir",
            "/root/logs/end.log",
            "file.txt"
        };

        for (String path : paths) {
            System.out.println(path + " : " + path.matches(regex));
        }
    }
}