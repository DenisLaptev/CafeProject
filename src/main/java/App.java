import java.util.*;

/**
 * Created by Lenovo on 31.03.2017.
 */
public class App {

    private static Map<Client, List<Dish>> ordersMap = new HashMap<Client, List<Dish>>();

    public static void main(String[] args) {

        generateOrdersMap();

        printInfoForTheOrders();
    }

    private static void printInfoForTheOrders() {
        Iterator iterator = ordersMap.keySet().iterator();
        while (iterator.hasNext()) {
            Client client = (Client) iterator.next();

            System.out.println("Order of " + client.getName() + ": " + ordersMap.get(client));
            double totalPrice = calculateTotalPriceOfTheClientOrder(client);
            System.out.println("Total price: " + totalPrice);
            System.out.println("--------------------------------------------");
        }
    }

    private static void generateOrdersMap() {
        Client client1 = new Client("Vasja", 25);
        List<Dish> dishes1 = new ArrayList<Dish>();
        dishes1.add(new Dish("Dish1", 10));
        dishes1.add(new Dish("Dish2", 20));
        dishes1.add(new Dish("Dish3", 30));
        ordersMap.put(client1, dishes1);


        Client client2 = new Client("Kolja", 27);
        List<Dish> dishes2 = new ArrayList<Dish>();
        dishes2.add(new Dish("Dish1", 10));
        dishes2.add(new Dish("Dish2", 20));
        ordersMap.put(client2, dishes2);


        Client client3 = new Client("Petja", 26);
        List<Dish> dishes3 = new ArrayList<Dish>();
        dishes3.add(new Dish("Dish3", 30));
        ordersMap.put(client3, dishes3);
    }

    public static double calculateTotalPriceOfTheClientOrder(Client client) {
        double totalPrice = 0;
        List<Dish> listOfTheDishesOfTheCleint = ordersMap.get(client);
        for (Dish dish : listOfTheDishesOfTheCleint) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }
}
