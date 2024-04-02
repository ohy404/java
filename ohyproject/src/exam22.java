import java.util.Scanner;

public class exam22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 st loop");
            boolean bExit=false;
            while (true) {
                System.out.println("2 st loop");
                System.out.print(">>");
                String text = scanner.nextLine();
                if (text.equals("help")) {
                    System.out.println("종료할려면 exit.");
                } else if (text.equals("exit")) {
                    break;
                } else if (text.equals("exit2")) {
                    bExit = true;
                    break;
                }
            }
            if(bExit) break;
        }
        scanner.close();
    }
}
