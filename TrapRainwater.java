public class TrapRainwater {

    public static int TrappedRainwater(int H[]){

        int n=H.length;
        //CALCULATE LEFT MAX BOUNDARY
        int leftMax[]=new int[n];
        leftMax[0]=H[0];
        for(int i= 1;i<n;i++){
            leftMax[i]= Math.max(H[i], leftMax[i-1]);
        }
        //RIGHT MAX BOUNDARY
        int rightMax[]=new int[n];
        rightMax[n-1]=H[n-1];
        for(int i= n-2;i>0;i--){
            rightMax[i]= Math.max(H[i], rightMax[i+1]);
        }

        int trappedwater=0;
        //LOOP
        for(int i= 0;i<n;i++){
            //WATERLEVEL =MIN(LEFT/RIGHT MAX)
           int WATERLEVEL= Math.min(leftMax[i], rightMax[i]);

           //TrapRainwater=WATERLEVEL - H
           trappedwater += WATERLEVEL - H[i];

        }
        return trappedwater;
    }

    public static void main(String[] args) {
         int H[]={4,2,0,6,3,2,5};

         System.out.println(TrappedRainwater(H));
    }
}
