public class TestMain {
    public static void main(String[] args) {
        ClassArray cla = new ClassArray();

        // Добавление элементов
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Сколько строк добавить? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        for (int i = 0; i < count; i++) {
            System.out.print("Строка " + (i+1) + ": ");
            String line = scanner.nextLine();
            cla.add(line);
        }

        System.out.println("\nРазмер массива: " + cla.getSize());
        System.out.println("Максимальный элемент: '" + cla.getMaxByLength() + "'");
        System.out.printf("Средняя длина: %.2f\n", cla.getAverageLength());
    }
}
