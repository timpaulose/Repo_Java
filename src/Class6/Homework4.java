package Class6;

public class Homework4 {
    public static void main(String[] args) {

        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 1300.0;
        double maxScore = 1600.0;
        double percentage = (studentScore / maxScore) * 100.0;

        if (percentage >= 91.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: A");
        } else if (percentage >= 81.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: B");
        } else if (percentage >= 71.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: C");
        } else if (percentage >= 61.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: D");
        } else if (percentage >= 51.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: E");
        } else if (percentage <= 50.0) {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: F");
        } else {
            System.out.println("Your percentage : " + percentage + "%");
            System.out.println("Your grade: Invalid");
        }



            /**
             * store value in an int variable
             * if number is divisible by 3, print "divisible by 3"
             * if number is divisible by 5, print "divisible by 5"
             * if number is divisible by 3 and 5, print "divisible by both"
             * if not divisible by 3 or 5, print the number
             */
            int num = 30;
            if (num % 3 == 0 && num % 5 != 0){
                System.out.println(num + " is divisible by 3.");
            } else if (num % 5 == 0 && num % 3 != 0){
                System.out.println(num + " is divisible by 5.");
            } else if (num % 3 ==0 && num % 5 ==0){
                System.out.println(num + " is divisible by both 3 and 5.");
            } else {
                System.out.println(num);
            }


            /**
             * Checking car mode (P, D, N, R)   // switch
             * if car mode is P and "you can park car"
             * if car mode is D drive car
             *      if drive type is Snow, display "You are on Snow mode"
             *      if drive type is Sport, display "You are on Sport mode"
             *      if drive type is Eco, display "You are on Eco mode"
             * if car mode is N you can "put car in car wash"
             * if car mode is R you can "revere the car"
             */
            char gear = 'P';
            String cMode = "Snow";  // Snow, Sport or Eco
            switch (gear) {
                case 'P':
                    System.out.println("You can park your car.");
                    break;
                case 'D':
                    if (cMode == "Snow"){
                        System.out.println("You are on Snow Mode.");
                    } else if (cMode == "Sport"){
                        System.out.println("You are on Sport Mode.");
                    } else if (cMode == "Eco"){
                        System.out.println("You are on Eco Mode.");
                    }
                    break;
                case 'N':
                    System.out.println("You can put your car in the car wash.");
                    break;
                case 'R':
                    System.out.println("You can reverse your car.");
                    break;
            }
    }
}
