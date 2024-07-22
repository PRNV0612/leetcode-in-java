//42.Trapping rain water

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int water=0;

        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=height[0];
        
        //find max element 
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],height[i]);
        }

        //find max element from the right
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]= Math.max(right[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}


//200ms runtime

// class Solution {
//     public int trap(int[] height) {
//         int maxh=0;
//         int water=0;
//         int n=height.length;
        
//         for(int i=0;i<n-1;i++){
//             if(height[i]<maxh){
//                 int maxr=0;
//                 for(int j=i;j<n;j++){
//                     maxr=Math.max(height[i],maxr);
//                 }
//                 water+=Math.min(maxh,maxr)-height[i];
//             }
//             else{
//                 maxh=height[i];
//             }
//         }
//         return water;
//     }
// }
