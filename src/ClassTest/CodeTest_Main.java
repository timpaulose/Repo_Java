package ClassTest;

import java.util.Arrays;

public class CodeTest_Main {

    public static void main(String[] args) {

        CodeTest c1 = new CodeTest();

        int[] arrOld = {67, 90, 190, 90, 34, 90, 10, 89, 57, 90};
        int numToRemove = 90;
        System.out.println(Arrays.toString(c1.removeNumber(arrOld, numToRemove)));


        int[] arrOriginal = {1, -2, 7, 6, 4, -6, 3, 5, 89, 2};
        System.out.println(c1.missingPosInteger(arrOriginal));

        c1.ticketSystem(70);
    }


}
