import java.util.Scanner;
public class exam11 {
    public static void main(String[] args){
        Scanner _Scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int nNum = _Scanner.nextInt();

        if(nNum%2 == 0)
        {
            System.out.println("짝수입니다.");
        }
        else
        {
            System.out.println("홀수입니다.");
        }
        _Scanner.close();
    }
}
