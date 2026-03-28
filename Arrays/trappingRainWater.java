public class trappingRainWater {
    public static int CalcRW(int[] height){
        //calc leftmax
        int n=height.length;
        int[] leftMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calc rightmax

        int[] rtMax=new int[n];
        rtMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rtMax[i]=Math.max(rtMax[i+1],height[i]);
        }
        //water level
        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rtMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
        //trapped water
        }
    public static void main(String[] args){
        int[] height={4,6,1,2,9,4,6};
        System.out.println("Water trapped:"+ CalcRW(height));
    }
}
