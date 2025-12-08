public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);
            System.out.println("Площадь прямоугольника равна: " + rectangle.area());
            System.out.println("Периметр прямоугольника равен: " + rectangle.perimetr());

        Circle circle = new Circle(5);
            System.out.println("Площадь круга равна: " + circle.area());
            System.out.println("Периметр круга равен: " + circle.perimetr());

        Triangle triangle = new Triangle(4, 5, 8);
            System.out.println("Периметр треугольника равен: " + triangle.perimetr());
            System.out.println("Площадь треугольника равен: " + triangle.area());
    }
}