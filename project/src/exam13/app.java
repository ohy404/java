package exam13;

import java.util.*;

public class app {
    public static void main(String[] args) {
        myClass<String> _s = new myClass<>();
        myClass<Integer> _n = new myClass<>();

        _s.set("hello");
        _n.set(378);
        System.out.println(_n.get());
        System.out.println(_s.get());
    }
}
