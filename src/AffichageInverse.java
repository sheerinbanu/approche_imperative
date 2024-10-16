import java.util.Arrays;

public class AffichageInverse {


    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }

        int newLength = array.length;
        int[] arrayCopy = Arrays.copyOf(array, newLength);
        for (int m = 0; m < arrayCopy.length; m++) {
            System.out.println(arrayCopy[m]);
        }

    }

}
