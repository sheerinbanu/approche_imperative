import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Give a number between 1 and 10 for a multiplication table ");
        int nb = scanner.nextInt();
        System.out.println("your table is ");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(nb + " * " + i + " = " + (nb*i));
        }

    }
}
