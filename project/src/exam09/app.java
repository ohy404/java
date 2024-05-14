package exam09;
import java.util.*;


public class app {
    static public void printVector(Vector<point> _v){
        for(int i=0;i<_v.size();i++){
            point _p = _v.get(i);
    
            System.out.println(_p.toString());
        }
    }
    public static void main(String[] args) {
        //Vector<point> _v = new Vector<point>();
        Vector<point> _v = new Vector<>();
        //var _vi = new Vector<Integer>();

        _v.add(new point(2, 3));
        _v.add(new point(-5, 20));
        _v.add(new point(30, -8));

        printVector(_v);

        point _p1 = _v.get(1);
        _p1.setPoint(0,0);

        printVector(_v);

    }
    
}
