import java.util.Arrays;
import java.util.OptionalInt;
public class RechercheMin {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        OptionalInt result = Arrays.stream(array).min();
        System.out.println("Le plus petit élément du tableau est ");
        System.out.println(result.getAsInt());
    }
}
