/**
 * Created by Lenovo on 31.03.2017.
 */
public class Dish {

    private String name;
    private double price;

    public Dish(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
