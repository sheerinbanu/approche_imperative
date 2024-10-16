import java.util.Arrays;
import java.util.Collections;

public class InversionContenu {
    static void reverse(Integer[] myArray) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed array" + Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        Integer[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        reverse(array);


    }


}
