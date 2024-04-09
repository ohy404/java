import java.util.InputMismatchException;
import java.util.Scanner;

public class exam32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " 번째 입력 : ");
            try {
                sum += scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                scanner.next();
                i--;
                continue;
            }
        }
        System.out.println("result : " + sum);
        scanner.close();

    }
}
