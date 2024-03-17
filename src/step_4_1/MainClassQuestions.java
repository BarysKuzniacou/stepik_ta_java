package step_4_1;

public class MainClassQuestions {
    public static void main(String[] args) {
        /*
        int[][] arr = {{1, 2, 3} , {4, 5, 6}};
        System.out.println(arr.length);

        for (int element: arr[0]) {
            System.out.println(element);
        }
        */

        /*
        String[] strArray = new String[] {"One", "Two", "Three"};
        strArray[2] = null;
        for (String val : strArray)
            System.out.print(val + ", ");

         */

        /*
        multiplicationTable = [[I@14991ad
        multiplicationTable[0] = null
        multiplicationTable[1] = null
        multiplicationTable[2] = null


        Create array

        multiplicationTable[0] = [I@d93b30
        multiplicationTable[1] = [I@16d3586
        multiplicationTable[2] = [I@154617c


        Initialize array

        0 0 0
        0 0 0
        0 0 0
         */

        int[][] multiplicationTable = new int[3][];
        System.out.println("multiplicationTable = " + multiplicationTable );
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[3];
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nInitialization array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(" " + multiplicationTable[i][j]);
            }
            System.out.println();
        }

        String[] ejgStr = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } }[0];
        String[] ejgStr1 = null;
        String[] ejgStr2 = { null };
        System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]);




    }
}
