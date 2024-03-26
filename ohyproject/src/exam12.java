import java.util.Scanner;

public class exam12 {
    public static void main(String[] args){
        Scanner _Scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        int nScore = _Scanner.nextInt();
        System.out.println("점수는 "+ nScore +" 이시네요");
        System.out.println("나이를 입력해주세요.");
        int nAge = _Scanner.nextInt();
        System.out.println("나이는 "+ nAge +" 이시네요");

        if(nScore >= 50)
        {
            if(nAge >= 60)
            {
                System.out.println("점수는 "+ nScore + " 이며 나이는 " + nAge + " 이므로 합격입니다.");
            }
            else if(nScore >= 70)
            {
                System.out.println("점수는 "+ nScore + " 이며 나이는 " + nAge + " 이므로 합격입니다.");
            }
            else
            {
                System.out.println("점수는 "+ nScore + " 이며 나이는 " + nAge + " 이므로 불합격입니다.");
            }
        }
        else
        {
            System.out.println("점수는 "+ nScore + " 이며 나이는 " + nAge + " 이므로 불합격입니다.");
        }
        _Scanner.close();
    }
}
