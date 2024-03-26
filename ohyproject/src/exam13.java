import java.util.Scanner;
public class exam13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산자 선택 (+,-,/,*): ");
        String _op = scanner.nextLine();

        System.out.print("두 수를 입력해주세요 (1 2) : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char _op_Char = _op.charAt(0);
        if(_op_Char == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }
        else if(_op_Char == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }
        else if(_op_Char == '/'){
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
        else if(_op_Char == '*'){
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        }
        else{
            System.out.println("올바른 연산자를 선택해주세요");
        }

        scanner.close();
    }
}
