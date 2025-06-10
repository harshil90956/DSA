public class TrappedRainWater {


    public static int trappedRainWater(int height[]){

        // left max 
        int leftmax[] = new int[height.length];
        int n = height.length;
        leftmax[0] = height[0];
        for(int i = 1;i < n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        // rightmax 
        int rightmax[] = new int[n];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = n-2;i >=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        for(int i = 0;i < n;i++){
            // w is minimum of lm and rm 
            int waterLevel = Math.min(rightmax[i],leftmax[i]);
            // tp = waterlevel - bar height * width 
             trappedwater += waterLevel-height[i];
        }

       return trappedwater;

    }

 public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println("trapped water is " + trappedRainWater(height));
 }   
}
