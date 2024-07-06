//#189 Rotate K items in array
//step 1: take modulus k=k%n (eg:if n=7,k=73,k%n=3 therefore, we only need to rotate 3 times)
//step 2: reverse the whole array
//step 3: reverse first k elements
//step 4: reverse rest n-k elements

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    void reverse(int[] nums,int start,int end){
        int i=start, j=end;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}