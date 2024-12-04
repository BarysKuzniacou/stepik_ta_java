package step_9_2_exception_handling;

public class MainQuestion02 {
    public int getInt() {
        int returnVal = 10;
        try  {
            String[] students = {"Harry", "Paul"};
            System.out.print(students[5]);
        }  catch (Exception e) {
            System.out.print(returnVal);
            return returnVal;
        }  finally {
            returnVal  += 10;
            System.out.print(returnVal);
        }
        return returnVal;
    }

    public static void main(String[] args) {
        MainQuestion02 main = new MainQuestion02();
        System.out.print(main.getInt());
    }
}
