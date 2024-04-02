public class exam25 {
    public static void main(String[] args) {
        int[] nums = {3,7,4,9,5,12,8,2};

        int nMax = -999;

        int nSum = 0;

        for(int i=0;i<nums.length;i++){
            int _nums = nums[i];
            if(nMax < nums[i]){
                nMax=_nums;
            }
            System.out.print(" "+nums[i]);
            System.out.print(" "+_nums);
            nSum += nums[i];
        }
        System.out.println();
        System.out.println("더한값 : "+ nSum);
        System.out.println("평균값 : "+ nSum/nums.length); 
        System.out.println("최대값 : "+ nMax);
    }

}
