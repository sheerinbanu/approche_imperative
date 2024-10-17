import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Give a number between 1 and 10");
        int nb = scanner.nextInt();

        while(!(nb>=1 && nb<=10)) {
            System.out.println("Give a number between 1 and 10");
            nb = scanner.nextInt();
        }

        System.out.println("The number you have given is " + nb);
    }
}
