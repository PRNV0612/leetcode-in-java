//11. Container with the most water;

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int max_area=0;
        int i=0,j=n-1;

        while(j>i){
            int area;
            if (height[i]>height[j]){
                area=height[j]*(j-i);
                j--;
                if(area>max_area){
                    max_area=area;
                }
            }
            else{
                area=height[i]*(j-i);
                i++;
                if(area>max_area){
                    max_area=area;
                }
            }
        }
        return max_area;
    }
}




















//not efficient does not handle large inputs

// public class most_water {
//         public static int maxArea(int[] height) {
//             int n=height.length;
    
//             int max_area=0;
//             for(int i=0;i<n;i++){
//                 for(int j=i;j<n;j++){
//                     int area=0;
//                     if(height[j]<height[i]){
//                         area=height[j]*(j-i);
//                         if(area>max_area){
//                             max_area=area;
//                         }
//                     }
//                     else{
//                         area=height[i]*(j-i);
//                         if(area>max_area){
//                             max_area=area;
//                         }
//                     }
//                 }
//             }
//             return max_area;
//         }
    
//         public static void main(String[] args) {
//             int[] height={1,8,6,2,5,4,8,3,7};
//             System.out.println(maxArea(height));

//         }

// }
