package Class2;

public class Homework1 {

    public static void main(String[] args) {

        //Scenario 1
        byte numOfHours = 24;
        System.out.println("There are " + numOfHours + " hours in a day.");

        //Scenario 2
        short numOfDays = 365;
        System.out.println("There are " + numOfDays + " days in a year.");

        //Scenario 3
        int numOfEmployees = 1000000;
        System.out.println("Amazon has " + numOfEmployees + " employees currently.");

        //Scenario 4 - int is also applicable here but I used long for the sake of the HW assignment
        long countryPopulation = 1390000000L;
        System.out.println("The country of China has a total population of " + countryPopulation + ".");

        //Scenario 5
        float intRate = 3.040f;
        System.out.println("The average 30-Year Fixed Rate is " + intRate + "%.");

        //Scenario 6
        double acctBalance = 40200.99;
        System.out.println("The average bank account balance for a U.S. household is $" + acctBalance + ".");

        //Scenario 7
        boolean sunRise = false;
        System.out.println("Does the Sun rise from the West? " + sunRise);

        //Scenario 8
        char firstInitial = 'T';
        char lastInitial = 'P';
        System.out.println("The initials for my name are " + firstInitial + lastInitial + ".");

        //Scenario 9
        String fullName = "Tim Paulose";
        System.out.println("My full name is " + fullName + ".");
    }
}
