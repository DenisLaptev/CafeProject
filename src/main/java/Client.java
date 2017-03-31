/**
 * Created by Lenovo on 31.03.2017.
 */
public class Client {

    private String name;
    private int age;

    public Client(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
