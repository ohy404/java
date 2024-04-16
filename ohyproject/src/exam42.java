class Staticsample {
    static int m;
    int n;
    int getNumber() {
        return m+n;
    }
}

public class exam42 {
    public static void main(String[] args) {

        Staticsample a = new Staticsample();
        Staticsample b = new Staticsample();

        a.n = 1;
        b.n = 2;
        System.out.println(a.n+","+b.n);

        //a.m = 1;
        //b.m = 3;
        Staticsample.m = 3;
        System.out.println(a.m+","+b.m);
        System.out.println(a.getNumber()+","+b.getNumber());
        Staticsample.m = 0;
        System.out.println(a.m+","+b.m);
        System.out.println(a.getNumber()+","+b.getNumber());
    }
}
