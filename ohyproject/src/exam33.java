public class exam33 {
    public static void main(String[] args) {
        String[] strNumber = { "23", "3" };

        for (int i = 0; i < strNumber.length; i++) {
            try {
                int _num = Integer.parseInt(strNumber[i]);
                System.out.println("==>" + _num);
            } catch (NumberFormatException e) {
                System.out.println("번환 실패 : " + strNumber[i]);
            }
        }
    }
}
