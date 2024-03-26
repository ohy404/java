public class exam17 {
    public static void main(String[] args) {
        char c = 'a';
        do{
            System.out.println(c + ":" + (int)c);
            c= (char )(c+1);
        } while(c <= 'z');
    }
}
