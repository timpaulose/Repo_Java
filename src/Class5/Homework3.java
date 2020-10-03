package Class5;

public class Homework3 {
    public static void main(String[] args) {

        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */

        String fullName = "Tim Paulose";
        String[] namesSplit = fullName.split(" ");
        String firstName = namesSplit[0];   //Tim
        System.out.println("My first name is " + firstName + " and its length is: " + firstName.length());

        String lastName = namesSplit[1];    //Paulose
        boolean doesStartWithK = lastName.toUpperCase().startsWith("K");
        System.out.println("Does my last name '" + lastName + "' start with 'K'? " + doesStartWithK);

        int lastIndexFName = firstName.length()-1;
        char lastChar = firstName.charAt(lastIndexFName);
        System.out.println("The last letter of my first name, " + firstName + ", is: " + lastChar);

        boolean doesEndWithM = lastName.toLowerCase().endsWith("M");
        System.out.println("Does my last name '" + lastName + "' end with 'M'? " + doesEndWithM);



        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */
        String myStatement = "I am a good programmer";
        String[] words = myStatement.split(" ");
        int wordsTotal = words.length;
        System.out.println("The word count in my statement, '" + myStatement + "' is " + wordsTotal);
        String myStatementRWithF = myStatement.replace("r", "f");
        System.out.println("After replacing all r's with f's, my statement becomes: " + myStatementRWithF);


        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */
        String[] fNameSplit = firstName.split("");
        int fNameLength = fNameSplit.length;
        System.out.println("The length of my first name is: " + fNameLength);


        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */
        String strNew = "hello dear, how are you?";
        boolean result = strNew.length()>10?true:false;
        System.out.println("Does the statement, '" + strNew + "' have a length longer than 10? " + result);



        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */
        String threeWordsSentence =  "hApPY nEW yeAr";
        System.out.println(threeWordsSentence);

        String[] threeWords = threeWordsSentence.toLowerCase().split(" ");

        String f1 = threeWords[0].substring(0,1).toUpperCase();
        String l1 = threeWords[0].substring(1);
        threeWords[0] = f1 + l1 ;

        String f2 = threeWords[1].substring(0,1).toUpperCase();
        String l2 = threeWords[1].substring(1);
        threeWords[1] = f2 + l2 ;

        String f3 = threeWords[2].substring(0,1).toUpperCase();
        String l3 = threeWords[2].substring(1);
        threeWords[2] = f3+ l3 ;

        threeWordsSentence = threeWords[0] + " " + threeWords[1] + " " + threeWords[2];
        System.out.println("Correction: " + threeWordsSentence);

        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String threeWordsSentence2 = "Lab sessIONS clAsses";
        String[] threeWords2 = threeWordsSentence2.toUpperCase().split(" ");

        String a1 = threeWords2[0].substring(0,1);

        String a2 = threeWords2[1].substring(0,1);

        String a3 = threeWords2[2].substring(0,1);

        System.out.println("Abbreviation: " + a1 + a2 + a3);
    }
}
