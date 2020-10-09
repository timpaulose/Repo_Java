package Class8;

public class Homework6 {

    public static void main(String[] args) {

        //Create a method to find average of an int-array
        int[] arrNums = {15,25,35,45,55,65,75,85};
        double avg = arrayAvg(arrNums);


        //Create a method (NO return) that will print the index of given name in the given array
        String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};
        String name = "philip";
        findName(names, name);

    }

    /**
     * Create a method to find average of an int-array
     *
     */
    public static double arrayAvg(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double result = sum / arr.length;
        System.out.println("Your average is: " + result);
        return result;

    }

    /**
     *
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method (NO return) that will print the index of given name in the given array
     *
     */
    public static void findName(String[] names, String nameToFind) {
        int index = -1;
        for (int i=0; i < names.length ; i++) {
            if (names[i].equalsIgnoreCase(nameToFind)) {
                System.out.println(nameToFind + " is at index: " + i);
                break;
            }
        }
    }

}