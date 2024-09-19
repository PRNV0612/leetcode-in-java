class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right=s.length()-1;

        while(left<=right){
            char leftchar=Character.toLowerCase(s.charAt(left));
            char rightchar=Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightchar)){
                right--;
            }
            else if(leftchar != rightchar){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}