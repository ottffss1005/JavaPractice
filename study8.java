import java.util.*;

public class study8 {

         static int discount (int code, int mon) {
             if (0 <= code && code <= 3) {
                 return (int) (0.9 * mon);
             } else if (4 <= code && code <= 7) {
                 return (int) (0.8 * mon);
             } else if (8 <= code && code <= 10) {
                 return (int) (0.7 * mon);
             } else {
                 return (int) (0.95 * mon);
             }
         }
         static int savepoint (int price, int save) {
                if (save>price*0.5) {
                    return (int)(price*0.5);
                }else {
                    return price - save;
                }
            }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("상품코드와 결제금액, 적립금을 순서대로 입력하세요: ");
        int code=scanner.nextInt();
        int mon=scanner.nextInt();
        int price=discount(code,mon);
        int savepoint=scanner.nextInt();
        int save=scanner.nextInt();
        int fin = savepoint(price, save);
        System.out.println("최종 결제 금액은"+fin+"원입니다.");
    }
}






