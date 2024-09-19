//question 55. Jump game I

class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean dp[]=new boolean[n];
        dp[n-1]=true;

        for(int i=n-2;i>=0;i--){
            for(int j=1;j<=nums[i] && dp[i]==false && i+j<n; j++){  /*j is the jump range (eg:if nums[j]=2,
                 we can either jump 1 step or 2 steps. 
                 and if the current dp[i] is already false then there is no point in contnuing. 
                 also we have to check if the jump is going over the size of the array.
                 */

                dp[i]=dp[i+j]; //if it is possible(true) to jump go to the end from i+j then it is possible to go to the end from i, so dp[i] will also be true
            }
        }

        return dp[0];
    }
}