import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        Map<String, Product> collection = new LinkedHashMap<>();
        while(!command.equals("buy")){
            String[] input = command.split(" ");
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);
            if(collection.containsKey(name)) {
                collection.get(name).setPrice(price);
                collection.get(name).setQuantity(collection.get(name).getQuantity()+quantity);

            }else {
                collection.put(name, new Product(name, price, quantity));
            }

            command=scan.nextLine();
        }
        collection.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.totalPrice()));

    }

}
 class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double totalPrice(){
        return price*quantity;
    }
}
