class Class_A{
    Class_A(){
        System.out.println("do class A");
    }
    Class_A(int x){
        System.out.println(x+ " value class A");
    }
}
class Class_B extends Class_A{
    Class_B(){
        System.out.println("do class B");
    }
    Class_B(int x){
        super(x);
        System.out.println(x+ " value class B");
    }
}

class Class_C extends Class_B{
    Class_C(){
        System.out.println("do class C");
    }
}
public class exam48 {
    public static void main(String[] args) {
        Class_C _Cobj = new Class_C();
        Class_B _Bobj = new Class_B(99);
    }

}
