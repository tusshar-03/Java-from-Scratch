public class LargestNumArray {

    public static int LargestNum(int nums[]) {
    
        int Num= Integer.MIN_VALUE; //-infinity
        //int Num = nums[0];
        int small = Integer.MAX_VALUE;
        for(int i= 1;i<nums.length;i++){
            if(nums[i]>Num){
                Num=nums[i];
            }
            if(small>nums[i]){
                small=nums[i];
            }
        }
        System.out.println("Smallest Num in Array : "+small);
        return Num;
    }

    public static void main(String[] args) {
        int nums[]={1,2,6,3,5};
        System.out.println("Largest Num in Array : "+LargestNum(nums));
    }
}
