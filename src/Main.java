import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean flag = true;
        int[] array = new int[4];


        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(array));


        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }


        }

        if (flag) System.out.println("Строго возрастающая последовательность");
        else System.out.println("Не возрастающая последовательность");


    }
}

