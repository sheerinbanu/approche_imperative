import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] sortedArray = supThree(array);
        System.out.println("Entiers supérieurs à trois " + Arrays.toString(sortedArray));
        Set<Integer> evenNumber = evenSort(array);
        for (int num : evenNumber) {
            System.out.println("Les nombres pairs " + num);

        }
    }

    public static Set<Integer> evenSort(int[] array) {
        ArrayList<Integer> evenNb = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                evenNb.add(i);
            }
        }
        int[] evenNumber = new int[evenNb.size()];
        Set<Integer> setEvenNb = new HashSet<>();
        for (int i = 0; i < evenNb.size(); i++) {
            evenNumber[i] = evenNb.get(i);
            for (int j = 0; j < evenNumber.length; j++) {
                setEvenNb.add(evenNumber[i]);
            }
        }
        return setEvenNb;
    }

    public static int[] supThree(int[] array) {
        ArrayList<Integer> nbSupTrois = new ArrayList<>();
        for (int num : array) {
            if ((num > 3)) nbSupTrois.add(num);
        }
        int[] sortedArray = new int[nbSupTrois.size()];
        for (int i = 0; i < nbSupTrois.size(); i++) {
            sortedArray[i] = nbSupTrois.get(i);
        }
        return sortedArray;
    }

}