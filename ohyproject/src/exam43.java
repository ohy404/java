class Staticsample2 {
    int n;
    static int m;

    void g() {
        n = 20;
    }

    void h() {
        m = 30;
    }

    static void f() {
        m = 7;
        //n = 1;
    }
}

public class exam43 {

    public static void main(String[] args) {
        Staticsample2 _s = new Staticsample2();
        _s.g();
        _s.h();

        System.out.println(_s.n + "," + Staticsample2.m);
        Staticsample2.f();
        System.out.println(_s.n + "," + Staticsample2.m);
    }
}
