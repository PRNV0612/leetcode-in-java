//33. Search in Rotated Sorted Array

//find point of rotation
//[4,5,6,7,0,1,2] sorted array is rotated 4 times


class Solution {
    public int search(int[] nums, int target) {
        
        int por=FindPOR(nums);

        if(por==0){
            return BinarySearch(nums,0,nums.length-1,target);
        }

        else if(target >= nums[0]){
            return BinarySearch(nums,0,por-1,target);
        }
        else{
            return BinarySearch(nums,por,nums.length-1,target);
        }

    }

    public int FindPOR(int[] nums){
        int por=0;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=nums[0]){
                start=mid+1;
            }
            else{
                por=mid;
                end=mid-1; 
            }
        }
        return por;
    }

    public int BinarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                return mid; 
            }
        }
        return -1;
    }
}