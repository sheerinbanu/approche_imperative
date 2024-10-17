import java.util.Arrays;
import java.util.Comparator;

public class Rotation {
    public static void main(String[] args) {

        Integer [] array = {1, 2, 3, 4, 5, 6};
        Arrays.stream(array).sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
