package step_8_4_practice.MainQuestion03;

public class Main {
    public static void main(String[] args) {
        PathDetector pathDetector = new PathDetector();
        String testPath = "C:\\User\\secret\\dont_look.txt";
        String result = pathDetector.detectPathNotation(testPath);
        System.out.println("Result for '" + testPath + "': " + result);
    }
}
