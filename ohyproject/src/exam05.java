public class exam05 {
    public static void main(String[] args){
        long m=25l;

        System.out.println("m : " + m);

        double d = 3.14 + m; // 자동 타입 전환  , long -> double

        System.out.println("d : "+ d);

        int n = 300; //32bit
        byte b = (byte)n; // int = 32bit -> byte = 8 bit 큰비트에서 작은 비트로 변환 불가

        System.out.println("b : "+ b);
        System.out.println("n : "+ n);
        System.out.println(0x12340041);
        System.out.println((char)0x12340041); //0x41 -> 'A'
    }
}
