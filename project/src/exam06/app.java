package exam06;

public class app {
    public static void main(String[] args) {
        
        String StrA = " C# ";
        String StrB = " java ";

        String StrC = StrA.concat(StrB);

        System.out.println(StrC);
        System.out.println(StrA == StrC);
        System.out.println(StrA.trim());
        System.out.println(StrB.replace("va", "++"));
        String StrD = new String("apple,banana,mango");
        String[] strAry = StrD.split(",");
        for(String strItem : strAry){
            System.out.println( strItem );
        }

        System.out.println(StrD.substring(6,12));
        System.out.println(StrD.charAt(5));
        System.out.println(StrD.charAt(12));
    }
}
