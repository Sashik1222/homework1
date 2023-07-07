public class Main2 {
    public static void main(String[] args) {
        int zuyg = 20;
        int[] array = new int[zuyg];

        int number = -19;
        for (int i = 0; i < zuyg; i++) {
            array[i] = number;
            number += 2;
        }
        for (int i = 0; i < zuyg; i++) {
            System.out.println(array[i]);
        }
    }
}

