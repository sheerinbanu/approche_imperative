public class FirstLast {
    public static void main(String[] args) {

        int[] array;

        int[] dummy = {1, 7, 8};
        checkArray(dummy);
        System.out.println(checkArray(dummy));
    }

    public static boolean checkArray(int[] array) {

        return array.length>=1 && array[0] == array[array.length-1];
    }

}