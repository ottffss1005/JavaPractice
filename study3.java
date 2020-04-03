import java.util.*;

public class study3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        double area = radius*radius*3.14;
        double round = 2*radius*3.141;

        System.out.printf("정원의 둘레는: %f", round);
        System.out.printf("%n정원의 넓이는: %f", area);


    }
}
