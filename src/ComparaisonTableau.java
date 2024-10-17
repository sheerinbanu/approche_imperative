import java.util.ArrayList;
import java.util.List;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        List<Integer> commonList = getCommonElement(array1, array2);
        System.out.println("Le nombre d'éléments commun dans ces deux tableaux sont  " + commonList.size());
    }

    public static List<Integer> getCommonElement(int[] array1, int[] array2) {
        ArrayList<Integer> commonElement = new ArrayList<>();
        for (int item : array1) {
            for (int element : array2) {
                if (item == element) {
                    if (!commonElement.contains(item)) {
                        commonElement.add(element);
                    }
                }
            }
        }
        return commonElement;
    }
}
