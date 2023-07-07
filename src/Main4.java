public class Main4 {
    public static void main(String[] args) {
        double[] array = {44.5, 101.3, 60.58, 21.12, 467.23, 30.5, 24.9, 690.5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 24.12 && array[i] < 467.23) {
                System.out.println(array[i]);
            }
        }
    }
}
