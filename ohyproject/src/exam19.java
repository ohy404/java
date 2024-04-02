public class exam19 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            int x;
            for (x = 0; x < i; x++) {
                System.out.print(" ");
            }
            for(;x<10;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}