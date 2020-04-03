import java.util.*;

public class study6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("명진관, 신공학관, 사회과학관, 상록원, 학림관 중 가려고 하는 건물을 입력해주세요: ");
        String place = scanner.nextLine();

        switch(place) {
            case "명진관":
                System.out.println("15분이 소요됩니다.");
                break;
            case "신공학관":
                System.out.println("10분이 소요됩니다.");
                break;
            case "사회과학관":
                System.out.println("22분이 소요됩니다.");
                break;
            case "상록원":
                System.out.println("17분이 소요됩니다.");
                break;
            case "학림관":
                System.out.println("12분이 소요됩니다.");
                break;

            default:
                System.out.println("잘못된 데이터입니다.");
        }

    }
}
