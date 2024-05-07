package exam05;

public class app {
    public static void main(String[] args) {
        String StrA = "apple";
        String StrB = "banana";
        String StrC = new String("apple");

        //int res = StrA.compareTo(StrB);
        System.out.println(StrA.compareTo(StrB));
        System.out.println(StrB.compareTo(StrA));
        System.out.println(StrA.compareTo(StrC));
        System.out.println(StrC.equals(StrB));
        System.out.println(StrC.equals(StrA));
        System.out.println(StrC == StrA);
    }
}
