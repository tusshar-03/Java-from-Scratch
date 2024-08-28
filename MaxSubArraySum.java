public class MaxSubArraySum {

    public static void Max_SubArray_sum(int arr[]){
        int n =arr.length;
        int currSum= 0;
        int maxSum= Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            
            for(int j=i;j<n;j++){
                
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum +=arr[k];
                
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum; 
                }
                
            }
            
        }
        System.out.println("Max Sub Array Sum : "+maxSum);
    }

    //Prefic subarray sum 
    public static void PrefixSum(int arr[]){
        int n =arr.length;
        int currSum= 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]=new int[n];

        prefix[0]=arr[0];
        //calculate prefix sum
        for (int i =1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                
                currSum= i== 0? prefix[j] : prefix[j]-prefix[i-1];
                
                
                if(maxSum<currSum){
                    maxSum=currSum; 
                }
                
            }
            
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        
        Max_SubArray_sum(arr);

        PrefixSum(arr);
    }
}