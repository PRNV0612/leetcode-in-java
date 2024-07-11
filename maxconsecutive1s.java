//find max consecutive 1's

public class maxconsecutive1s {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int ans=0;
            int ctr=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    ctr+=1;
                }
                else{
                    ans=Math.max(ans,ctr);
                    ctr=0;
                }
            }
            ans=Math.max(ans,ctr);
            return ans;
        }
    }    
}
