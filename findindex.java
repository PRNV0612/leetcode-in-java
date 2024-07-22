//34.find first and last elements 

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=searchFirst(nums,target);
        int last=searchLast(nums,target);
        int[] ans={first,last};
        return ans;
    }

    public int searchFirst(int nums[],int target){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }

    public int searchLast(int nums[],int target){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}