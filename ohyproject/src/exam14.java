import java.util.Scanner;
public class exam14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("연산자 선택 (+,-,/,*,$): ");
        String _op = scanner.nextLine();

        System.out.print("두 수를 입력해주세요 (1 2) : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char _op_Char = _op.charAt(0);
        switch (_op_Char) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
            
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;

            case '$':
                System.out.println(num1 + " 이랑 " + num2 + " 의 평균은 " + ((num1+num2)/2)+" 입니다." );
                break;
            
            default:
                System.out.println("올바른 연산자를 선택해주세요 (+,-,/,*,$)");
                break;
        }
        scanner.close();
    }

}
