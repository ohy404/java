public class exam03 {
    public static void main(String[] args){
        char a = 'A';
        char b = '한';

        System.out.println(a);
        System.out.println(b);

        char c = '\u0041';
        //char d = '\u231a';
        char d = '\u2460';

        System.out.println(c);  
        System.out.println(d);

        String e = "\u2500\u2510";
        String f = "\u250c\u2500\u2510\n\u2514\u2500\u2518";

        System.out.println(e);
        System.out.println(f);
    }
}
