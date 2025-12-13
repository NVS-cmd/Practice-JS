public class ClassArray {
    private String[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ClassArray() {
        array = new String[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(String str) {
        if (size >= array.length) {
            resize();
        }
        array[size++] = str;
    }

    private void resize() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public String getMaxByLength() {
        if (size == 0) return null;
        String max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        return max;
    }

    public double getAverageLength() {
        if (size == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i].length();
        }
        return (double) sum / size;
    }

    public int getSize() {
        return size;
    }
}
