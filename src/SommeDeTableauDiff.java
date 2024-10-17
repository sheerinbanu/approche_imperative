import java.util.stream.IntStream;

public class SommeDeTableauDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        IntStream concatenatedStream = IntStream.concat(IntStream.of(array1), IntStream.of(array2));
        int result = concatenatedStream.sum();
        System.out.println(result);
    }
}
