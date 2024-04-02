public class exam20 {
    public static void main(String[] args) {
        for (int i = 0; i < 37; i++) {
            int value = 10;
            double radian = Math.toRadians(i * 5);
            value = (int) (Math.sin(radian) * 50);
            for(int x=0;x<value;x++){
                System.out.print(" ");
            }
            System.out.print("\u25A0");
            //for (int y=value; y>(value%1);y++) {
            //    System.out.print("\u25A0");
            //}
            System.out.println();
        }
    }
}
