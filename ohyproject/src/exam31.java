public class exam31 {
    public static void main(String[] args) {
        int [] intArray = new int[5];
        intArray[0] = 0;

        try{
            for(int i=0;i<5;i++){
                intArray[i+1] = i + 1 + intArray[i];
                System.out.println(i + " : " + intArray[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("경고 : " + e.getMessage());
        }
        System.out.println("done");
    }
}
