package Class7;

public class Homework5 {
    public static void main(String[] args) {

        /**
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        String msg = "have happy and prosperous life";
        String abr = "";
        String[] words = msg.toUpperCase().split(" ");
        for (int i = 0; i <= words.length-1; i++){
            abr += words[i].charAt(0);
        }
        System.out.println("Abbreviation: " + abr);



        /**
         * Change the string to title case
         */
        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        String reverse = "";
        String[] wordsTitle = line.toLowerCase().split(" ");
        int j = 0;
        while(j < wordsTitle.length){
            String f1 = wordsTitle[j].substring(0,1).toUpperCase();
            String l1 = wordsTitle[j].substring(1);
            wordsTitle[j] = f1 + l1;
            reverse += " " + wordsTitle[j];
            j++;
        }
        reverse = reverse.trim();
        System.out.println("Line (After modification) : " + reverse);



        /**
         * reverse a string
         */
        String message = "happy holidays To you and Your Family";
        String reverseMessage = "";
        System.out.println("Message : " + message);
        for(int i = message.length()-1; i >= 0; i--){
            reverseMessage = reverseMessage + message.charAt(i);
        }
        System.out.println("Message in Reverse: " + reverseMessage);    // syadiloh yppah

    }
}
