package Class15.Homework9;

public class Restaurant {

    //Attributes of restaurant
    String restaurantName;
    int guestCapacity;
    int guestCount;


    // 1. Create a method that tells user if the seats are available
    public int seatsAvailable() {
        if ((guestCapacity - guestCount) <= 0) {
            System.out.println("We apologize, there are no available seats currently.");
        } else {
            System.out.println("Number of available seats are: ");
        }
        return guestCapacity - guestCount;
    }

    // 2. Create a method that seatsParty
    public void seatsParty (int guestsNumber) {
        if (guestsNumber <=0){
            System.out.println("Invalid number of guests.");
        }
        else if (guestsNumber > (guestCapacity - guestCount)) {
            System.out.println("We apologize, your party exceeds the restaurant's capacity");
        }
        else {
            guestCount = guestCount + guestsNumber;
        }
    }

    // 3. Create a method that removesParty
    public void removesParty (int guestsToRemove) {
        if (guestsToRemove >0 && guestsToRemove <= guestCount) {
            guestCount = guestCount - guestsToRemove;
        } else {
            System.out.println("Sorry, that number of guests is invalid.");
        }
    }

    //4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity
    public Restaurant(String name, int capacity) {
        restaurantName = name;
        guestCapacity = capacity;
    }

    // 5. Create a method that printsRestaurantSummary
    public void printRestSummary() {
        System.out.println("\nName of Restaurant: " + restaurantName +
                "\nCurrent Guest Count: " + guestCount +
                "\nGuest Capacity: " + guestCapacity);
    }
}