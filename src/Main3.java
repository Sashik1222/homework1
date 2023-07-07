public class Main3 {
    public static void main(String[] args) {
        int[] array = {1, 6, 12, 12, 15, 20, 25, 30, 40};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

