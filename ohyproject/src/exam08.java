import java.util.Scanner;
public class exam08 {
    public static void main(String[] args){
        Scanner _scanner = new Scanner(System.in);
        
        System.out.println("나이를 적으세요 : ");
        int age = _scanner.nextInt();

        // 당신은 x0 대 입니다.
        if(age / 10 == 0){
            System.out.println("당신은 아직 어립니다");
        }
        else{
            System.out.println("당신은 " + age / 10 + "0대 입니다");
        }
        _scanner.close();

    }
}
