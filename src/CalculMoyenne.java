import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        OptionalDouble result = Arrays.stream(array).average();
        System.out.println("La moyenne des éléments du tableau ");
        System.out.printf("Value: %.2f%n",result.getAsDouble());

    }
}
