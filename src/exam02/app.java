package exam02;
import exam01.Point;
public class app {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(4, 3);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
