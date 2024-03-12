public class exam01 {
    
    public static void main(String[] args){
        int a,b,c;
        a=1;
        b=2;

        System.out.println("a :"+ a);
        System.out.println("b :"+ b);

        a=3;

        System.out.println("a :"+ a);
        System.out.println("b :"+ b);

        c=b;
        b=a;
        a=c;

        System.out.println("a :"+ a);
        System.out.println("b :"+ b);
    }

}
