import java.util.Scanner;

public class exam06 {
    public static void main(String[] args){
        Scanner _s = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String strName = _s.nextLine();
        System.out.println("도시는 ?");
        String city = _s.next();
        System.out.println("나이는");
        int age = _s.nextInt();
        System.out.println("키는 ?");
        int tall = _s.nextInt();

        System.out.println("name : " + strName + " city : " + city + " age : "+ age +" tall : "+ tall);
        _s.close();
    }
}
