
class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        int ans=nums[0];

        int maxp=nums[0];
        int minp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=0){
                maxp=Math.max(nums[i],maxp*nums[i]);
                minp=Math.min(nums[i],minp*nums[i]);
            }
            else{
                int temp=maxp;
                maxp=Math.max(nums[i],minp*nums[i]);
                minp=Math.min(nums[i],temp*nums[i]);
            }

            ans=Math.max(ans,maxp);
        }

        return ans;

    }
}