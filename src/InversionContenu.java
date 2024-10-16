import java.util.Arrays;

public class InversionContenu {


    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array){
        int n = array.length;

        for (int i = 0; i < n/2; i++) {

            int temp = array[i];
            array[i]= array[n-i-1];
            array[n-i-1]=temp;

        }
    }

}
