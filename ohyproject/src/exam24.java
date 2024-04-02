public class exam24 {
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5};
        int[] refValue;
        refValue = array1;

            System.out.println(array1[0]);
            System.out.println(array1[2]);
            System.out.println(array1[array1.length-1]);
            //System.out.println(array1[-1]); //0보다 커야함
            refValue[2]=9;
            System.out.println(refValue[2]);
            System.out.println(array1[2]);
    }
}
