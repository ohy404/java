class SimpleMetod {
    static int getSum(int a,int b){
        return a+b;
    }
    static int getSum(int a,int b,int c){
        return a+b+c;
    }
}
public class exam41 {
    public static void main(String[] args) {
        System.out.println(SimpleMetod.getSum(1,2));
        System.out.println(SimpleMetod.getSum(1,2,3));
    }

}
