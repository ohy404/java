public class exam07 {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + ((a+b)));
        System.out.println("a + b = " + (a+b*2));
        System.out.println("a + b = " + ((a+b)*2));
        
        int c = 1;
        c++;
        System.out.println(++c); // 연산 먼저 하고 출력은 나중에 함
        System.out.println(c++); // 출력 먼저 하고 연산은 나중에 함
        System.out.println(c);
    }
}
