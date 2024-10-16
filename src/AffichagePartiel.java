import java.util.ArrayList;
import java.util.Arrays;

public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] sortedArray = supTrois(array);
        System.out.println("Entiers supérieurs à trois " + Arrays.toString(sortedArray));

    }

    static int[] supTrois(int[] array) {
        ArrayList<Integer> nbSupTrois = new ArrayList<>();
        for (int num : array) {
            if (num > 3)
                nbSupTrois.add(num);
        }
        int[] sortedArray = new int[nbSupTrois.size()];
        for (int i = 0; i < nbSupTrois.size(); i++) {
            sortedArray[i] = nbSupTrois.get(i);
        }
        return sortedArray;
    }

}