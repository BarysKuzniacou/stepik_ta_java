package step_8_4_practice.MainQuestion03;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class TestPath {
    private Path path;

    @BeforeEach
    void setUP() {
        path = new Path();
    }

    @Test
    public void test_unixPath_true_01() {
        String expectedResult = "Unix";
        String[] strPath ={"~/secret/dont_look.txt",
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
                            "file.txt"};

        String actualResult = path.pathNotation(strPath[0]);
        assertEquals(expectedResult.equals(actualResult), "test_unixPath_true_01");
    }
}
