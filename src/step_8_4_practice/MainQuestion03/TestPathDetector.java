package step_8_4_practice.MainQuestion03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPathDetector {
    private PathDetector pathDetector;

    @Before
    public void setUP() {
        pathDetector = new PathDetector();
    }

    @Test
    public void test_unixPath() {
        String[] strPath = {
                "~/secret/dont_look.txt",
                //".",
                "~",
                "~/",
                //"..",
                "/",
                "../anoTHER_folder",
                "../anoTHER_folder/",
                "../folder name",
                "dir/subdir/wrongsubdir/../rightdir",
                "/root/logs/end.log",
                //"file.txt"
        };
        String expectedResults = "Unix";

        for (int i = 0; i < strPath.length; i++) {
            String actualResult = pathDetector.detectPathNotation(strPath[i]);
            System.out.println(expectedResults.equals(actualResult) + " " +strPath[i] + " " + actualResult);
            assertEquals(expectedResults, actualResult);
        }
    }

    @Test
    public void test_windowsPath() {
        String[] strPath = {
                "C:\\User\\secret\\dont_look.txt",
                //".",
                "C:\\User",
                "C:\\User\\",
                //"..",
                "C:\\",
                "..\\anoTHER_folder",
                "..\\anoTHER_folder\\",
                "..\\folder name",
                "dir\\subdir\\wrongsubdir\\..\\rightdir",
                "C:\\root\\logs\\end.log"
        };
        String expectedResults = "Windows";

        for (int i = 0; i < strPath.length; i++) {
            String actualResult = pathDetector.detectPathNotation(strPath[i]);
            System.out.println(expectedResults.equals(actualResult) + " " +strPath[i] + " " + actualResult);
            assertEquals(expectedResults, actualResult);
        }
    }

    @Test
    public void test_BothPath() {
        String[] strPath = {
                //"C:\\User\\secret\\dont_look.txt",
                ".",
                //"C:\\User",
                //"C:\\User\\",
                "..",
                //"C:\\",
                //"..\\anoTHER_folder",
                //"..\\anoTHER_folder\\",
                //"..\\folder name",
                //"dir\\subdir\\wrongsubdir\\..\\rightdir",
                //"C:\\root\\logs\\end.log"
                "file.txt"
        };
        String expectedResults = "Both";

        for (int i = 0; i < strPath.length; i++) {
            String actualResult = pathDetector.detectPathNotation(strPath[i]);
            System.out.println(expectedResults.equals(actualResult) + " " +strPath[i] + " " + actualResult);
            assertEquals(expectedResults, actualResult);
        }
    }
}
