package exam08;
import java.util.Vector;

public class app {
    public static void main(String[] args) {
        
        Vector<Integer> _v = new Vector<Integer>(3); //재네리 코드 <>가 보이면 재네리 코드임

        System.out.println("capacity : " + _v.capacity());
        System.out.println("size : " + _v.size());

        _v.add(3);
        _v.add(7);

        System.out.println("capacity : " + _v.capacity());
        System.out.println("size : " + _v.size());

        _v.add(11);
        _v.add(17);

        System.out.println("capacity : " + _v.capacity());
        System.out.println("size : " + _v.size());

        _v.remove(0);

        System.out.println("capacity : " + _v.capacity());
        System.out.println("size : " + _v.size());

        System.out.println("value [0] :" + _v.get(0));
        System.out.println("value [0] :" + _v.elementAt(0));

        System.out.println(_v.toString());

        //Integer [] _array = (Integer[]) _v.toArray();

        //System.out.println(_array[0]);

    }
}
