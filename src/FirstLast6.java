public class FirstLast6 {
    public static void main(String[] args) {

        int[] array;

        int[] dummy = {1, 7, 6};
        checkArray(dummy);
        System.out.println(checkArray(dummy));
    }

    public static boolean checkArray(int[] array) {

        return array.length>0 && (array[0]==6 || array[array.length-1]==6);
    }
}
