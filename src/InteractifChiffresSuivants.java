import java.util.Arrays;
import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Give a number ");
        int nb = scanner.nextInt();
        System.out.println("The next 10 following numbers are :");
        System.out.println(Arrays.toString(next10Numbers(nb)));

    }
    public static int [] next10Numbers(int num) {
        int[] next10Numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            next10Numbers[i] = ++num;
        }
        return next10Numbers;

    }

}
