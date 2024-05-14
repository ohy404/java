package exam11;

import java.util.*;
public class app {
    public static void main(String[] args) {
        HashMap<String,student> _mapDB = new HashMap<>();

        _mapDB.put("lee", new student(1, "0000-1111"));
        _mapDB.put("oh", new student(2, "2320-1111"));
        _mapDB.put("kim", new student(3, "1522-1111"));

        //student _stu = _mapDB.get();
        //System.out.println("id:" + _stu.getid() + ", 전화:" + _stu.getphoneNumber());
    } 
}
