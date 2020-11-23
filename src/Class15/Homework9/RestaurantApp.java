package Class15.Homework9;

public class RestaurantApp {
    public static void main(String[] args) {

        //Methods in use
        Restaurant r1 = new Restaurant("Technosoft Restaurant", 150);

        r1.seatsParty(75);

        r1.removesParty(15);

        System.out.println(r1.seatsAvailable());

        r1.printRestSummary();

    }
}