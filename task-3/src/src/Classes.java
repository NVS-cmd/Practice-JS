class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Значения введены некорректно.");
        }
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimetr() {
        return 2 * (width + height);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Значения введены некорректно.");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
}

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 ) {
            throw new RuntimeException("Значения введены некорректно.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new RuntimeException("Треугольник не существует.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetr() {
        return a + b + c;
    }
    public double area() {
        double s = perimetr() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}