import java.util.*;

public class study7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요: ");
        int value = scanner.nextInt();
        int sum = 0;
        if (value <= 10) {
            System.out.println("배열의 크기는 10보다 커야합니다");
        } else {

            int[] array = new int[value];

            for (int i = 0; i < value; i++) {
                if (i%2==0){
                    array[i] = 1;}
                else { array[i] = 2;
                } sum += array[i];

            }System.out.println(sum);
        }
    }
}