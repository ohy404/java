public class exam18 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.print(i +" X "+ j + " = " +(i*j) +"\t");
                if(i%3 == 0){
                    if(j%9==0)
                    {
                        System.out.println();
                        System.out.print("-------------------------");
                        System.out.println();
                    }
                }
            }
        }
    }
}

