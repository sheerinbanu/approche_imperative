public class AffichageSuite {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Les nombres de 1 à 10 sont " + i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("les nombres pairs = " + i);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!(i % 2 == 0)) {
                System.out.println("les nombres impairs = " + i);
            }
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        int h = 0;
        while (h <= 10) {
            if (h % 2 == 0) {
                System.out.println(h);
            }
            h++;
        }

        int x = 0;
        while (x < 10) {
            if (!(x % 2 == 0)) {
                System.out.println(x);
            }
            x++;
        }

    }


}
