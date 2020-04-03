import java.util.*;

public class study1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 두 개를 입력해주세요:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int plus = first + second;
        int multi = first*second;

        if (first >= second) {
            int minus = first - second;
            int divide = first/second;
            System.out.println("덧셈: "+plus);
            System.out.println("뺄셈: "+ minus);
            System.out.println("곱셈: "+ multi);
            System.out.println("나눗셈: "+divide);}
        else    {
            int minus = second - first;
            int divide = second/first;
            System.out.println("덧셈: "+plus);
            System.out.println("뺄셈: "+ minus);
            System.out.println("곱셈: "+ multi);
            System.out.println("나눗셈: "+divide);
        }

    }
}
