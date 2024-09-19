//Question 283. Move Zeroes

class Solution {
    public int[] moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) {
            return nums;
        }

        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }

        return nums;

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}