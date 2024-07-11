//424.longest repeating character replacement
//You are given a string s and an integer k. You can choose any character of the string 
//and change it to any other uppercase English character. You can perform this operation at most k times.

//logic:
//length-max <= k


public class longestrepeatingchar {
    class Solution {
        public int characterReplacement(String s, int k) {
            int n=s.length();
            int[] cnt=new int[26];
            int maxcount=0;
            int maxlength=0;
            int start=0;
    
            for(int end = 0; end < n; end++ ){
                maxcount=Math.max(maxcount,++cnt[s.charAt(end)-'A']);
                while(end-start+1-maxcount > k){
                    cnt[s.charAt(start) - 'A']--;
                    start++;
                }
                maxlength=Math.max(maxlength,end-start+1);
            }
    
            return maxlength;
        }
    }

}
