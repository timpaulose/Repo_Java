package ClassTest;

public class CodeTest {

    //1. Create a method to return an int-array after removing a given int-value from a given int array.
    public int[] removeNumber(int[] arrOriginal, int numToRemove) {
        //How many numbers are supposed to be in new Array
        int arrayNewLength = 0;
        for (int i = 0; i < arrOriginal.length; i++) {
            if (arrOriginal[i] != numToRemove) {
                arrayNewLength++;
            }
        }
        //Add numbers to new Array
        int arrayNewIndex = 0;
        int[] arrayNew = new int[arrayNewLength];
        for (int i = 0; i < arrOriginal.length; i++) {
            if (arrOriginal[i] != numToRemove) {
                arrayNew[arrayNewIndex] = arrOriginal[i];
                arrayNewIndex++;
            }
        }
        return arrayNew;
    }

    //2. Create a method to return missing smallest positive integer (greater than 0) from given array.
    public int missingPosInteger(int[] arrIntegers) {
        int num = 1;
        for (int i = 0; i < arrIntegers.length; i++) {
            for (int j = 0; j < arrIntegers.length; j++) {
                if (arrIntegers[i] > 0) {
                    if (arrIntegers[j] == num) {
                        num++;
                        break;
                    }

                }
            }

        }
        return num;
    }

    //3. Scenario: Traffic ticketing system
    //     * Write a method, that will print (not return) the points charged against
    //     * the license for over speeding.
    public void ticketSystem(int speed) {
        int limit = 70;
        int numOfPoints = (speed - limit) / 5;

        if (numOfPoints <= 0) {
            System.out.println("Thank you for driving within the speed limit.");
        } else if (numOfPoints > 12) {
            System.out.println(numOfPoints + " points (Your License is suspended)");
        } else {
            System.out.println(numOfPoints + " points");
        }
    }
}
