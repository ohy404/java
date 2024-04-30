class Person49{
    String name;
    String id;
    public Person49(String name){
        this.name = name;
    }
}
class Student49 extends Person49{
    String grade;
    public Student49(String name){
        super(name);
    }
}
public class exam49 {
    public static void main(String[] args) {
        Student49 _s = new Student49("oh");
        Person49 _p = _s; //업케스팅
        System.out.println(_s.name);
        System.out.println(_s.grade);
        System.out.println(_p.name);
        //System.out.println(_p.grade);
        System.out.println(((Student49)_p).grade);//다운케스팅
        Student49 __S = (Student49)_p;
        System.out.println(__S.grade);

    }
}
