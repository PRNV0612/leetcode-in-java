//question 70. Climbing stairs

/*
 * memoization is keeping a record of the computed value for easier access
 * 
 * n is the number of stairs, u can climb it either 1 step at a time or 2 steps at a time
 * if u are already at the nth step then there is only 1 possible way u can reach the dest
 * same if u are at the (n-1)th step.
 * 
 * the (n-2)th step will have [n-1]+[n] possible ways to reach the destination 
 */



class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[n]=1;
        dp[n-1]=1;

        for(int i=n-2;i>=0;i--){
            dp[i]=dp[i+1]+dp[i+2];
        }

        return dp[0];
    }
}