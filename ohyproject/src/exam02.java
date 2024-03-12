public class exam02 {

    public static void main(String[] args){
        int a1 = 0x0f;
        int a2 = 0b10;

        System.out.println(a1);
        System.out.println(a2);

        float _pi = 3.14f;
        double __pi = 3.14;

        System.out.println(_pi);
        System.out.println(__pi);

        long b1 = 24356363443634435L;
        //int b1 = 24356363443634435;

        System.out.println(b1);

        double d = 0.1234;
        //double e = 1234 / 10000.0;
        double e = 1234E-4;
        double f = 1234e+4; // *10000

        System.out.println("d : "+ d);
        System.out.println("e : "+ e);
        System.out.println("f : "+ f);
        System.out.printf("f : %.0f \n",f);
    }
}
