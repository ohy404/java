import java.util.Scanner;

public class exam30 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나뉨수를 입력하시오 : ");
            int dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하시오 : ");
            int divisor = scanner.nextInt();
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "+dividend/divisor + "입니다");
                break;
            }
            catch(Exception e){
                System.out.println("에러 "+ e.getMessage()+ " 다시입력해주세요");
                
            }
            
        }
        scanner.close();
    }
}