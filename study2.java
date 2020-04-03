import java.util.*;

public class study2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 사람의 나이를 입력하세요: ");
        int per1 = scanner.nextInt();
        int per2 = scanner.nextInt();
        int dif = Math.abs(per1 - per2);

        if (dif%12==0) {
            System.out.println("띠 동갑입니다!");
        }
        else {
            System.out.println("띠 동갑이 아닙니다!");
        }
    }
}
