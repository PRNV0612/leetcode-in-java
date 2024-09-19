//4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0,j=0;
        double median=0.0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else{
                ans.add(nums2[j]);
                j++;
            }
        }

        if(i<nums1.length){
            while(i<nums1.length){
                ans.add(nums1[i]);
                i++;
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                ans.add(nums2[j]);
                j++;
            }
        }

        if(ans.size()%2==0){
            median=(ans.get(ans.size()/2)+ans.get((ans.size()/2)-1))/2.0;
        }
        else{
            median=(ans.get((ans.size()/2)));
        }

        return median;
    }
}