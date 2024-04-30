abstract class Caculator{
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);

}
public class exam51 extends Caculator {
    @Override 
    public int add(int a,int b){
        return a+b;
    }
    @Override 
    public int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        exam51 myCal = new exam51();

        System.out.println(myCal.add(1,2));
        System.out.println(myCal.sub(1,2));
    }    
}
