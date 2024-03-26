import java.util.Scanner;
public class exam10 {
    public static void main(String[] args){
        Scanner _Scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        int nScore = _Scanner.nextInt();

        if(nScore > 80){
            System.out.println("합격입니다.");
        }
        else{
            System.out.println("불합격입니다.");
        _Scanner.close();
        }
    }
}
