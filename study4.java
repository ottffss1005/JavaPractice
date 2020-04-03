public class study4 {
    public static void main(String[] args) {

        int sum = 0;
        int[] array = new int[50];

        for(int i=0; i<array.length; i++) {
            array[i] = 2 * i + 1;
            sum += array[i];
        }
        System.out.println(sum);
    }
}
