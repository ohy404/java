public class exam28 {
    public static void main(String[] args) {
        System.out.println("argv length : " + args.length);

        double sum = 0;
        for(String _arg:args){
            System.out.println(_arg);
            
            double value = Double.parseDouble(_arg);
            sum += value;
        }
        System.out.println(sum);
    }
}
//java exam28.java 1 3 7 = 11