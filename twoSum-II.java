class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] ans = new int[2];
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                ans[0] = left + 1; // 1-based index
                ans[1] = right + 1; // 1-based index
                break;
            } else if (sum < target) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
        
        return ans;
    }
}
