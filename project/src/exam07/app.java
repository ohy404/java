package exam07;

public class app {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello ");

        StringBuffer _sb = sb.append(" world");

        System.out.println(_sb);
        System.out.println(_sb == sb);

    }
}
