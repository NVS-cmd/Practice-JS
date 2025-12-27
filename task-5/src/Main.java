public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Создаем товары
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);

        // Добавляем в корзину
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Показываем корзину
        cart.printCart();

        // Удаляем товар
        System.out.println("Удаляем: Мышка");
        cart.removeProduct("Мышка");

        // Показываем обновленную корзину
        cart.printCart();
    }
}
