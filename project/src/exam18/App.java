package exam18;

import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector<Integer> _vt = new Vector<>();

        _vt.add(1);
        _vt.add(2);
        _vt.add(3);
        //Integer num = _vt.get(1);
        //num = 7;

        _vt.set(1,7);

        for(int i = 0;i<_vt.size();i++){
            System.out.println(_vt.get(i));
        }
        System.out.println("Hello,world!");
    }
}
