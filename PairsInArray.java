public class PairsInArray {

    public static void Pairs(int nums[]){
        int TP=0;//Total pairs
        int n = nums.length;
        for(int i=0;i<n;i++){
           // int curr=nums[i];//2 4 6 8 10

            for(int j=i+1;j<n;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
                TP++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+TP);
    }

    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};

        Pairs(nums);
    }
}
