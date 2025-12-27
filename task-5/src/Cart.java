import java.util.ArrayList;
import java.util.ListIterator;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(name));
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void printCart() {
        System.out.println("=== Корзина ===");
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            ListIterator<Product> iterator = products.listIterator();
            while (iterator.hasNext()) {
                System.out.println((iterator.nextIndex() + 1) + ". " + iterator.next());
            }
            System.out.println("Итого: " + getTotal() + " руб.");
        }
        System.out.println();
    }
}
