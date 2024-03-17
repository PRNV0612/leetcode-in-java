
class twosum {
    public int[] TwoSum(int[] nums, int target) {
        int sum=0;
        int num1=0;
        for(int i=0;i<nums.length;i++){
            num1=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=num1+nums[j];
                if(sum==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

}