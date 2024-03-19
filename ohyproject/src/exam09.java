public class exam09 {
    public static void main(String[] args){
        int a = 3;
        int b = 7;

        System.out.println((a < b ));
        System.out.println((a > b ));

        int nAge = 27;

        System.out.println("20 대가 맞나요? "+ ((nAge > 20) && (nAge < 30)));
        //System.out.println((nAge < 30));
        String strName = "oh";

        System.out.println(strName == "oh");
        System.out.println(strName == "kim");
        
        String strResult = a>b ? "a is big" : "b  is big";
        
    }
}
