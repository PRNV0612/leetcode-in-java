//26.longest substring without repeating Characters
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0,n = s.length(),fp=0,sp=0;

        Map<Character,Integer> map=new HashMap<>();
        while(sp<n){
            addToMap(map,s.charAt(sp));
            while(fp<sp && !isValid(map)){
                 deletefromMap(map, s.charAt(fp));
                 fp++;
            }
            int length=sp-fp+1;
            max=Math.max(max,length);
            sp++;
        }
        return max;
    }

    public void addToMap(Map<Character,Integer> mp,char c){
        mp.put(c,mp.getOrDefault(c,0)+1);
    }

    public void deletefromMap(Map<Character,Integer> mp, char c){
        mp.put(c,mp.get(c)-1);
    }

    public boolean isValid(Map<Character, Integer> mp){
        for(char c: mp.keySet()){
            if(mp.get(c)>1){
                return false;
            }
        }
        return true;
    }

}



// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         char[] chars = s.toCharArray();
//         int max = 0;
//         int n = s.length();
        
//         if (s.equals(" ")) {
//             return 1;
//         }
        
//         for (int i = 0; i < n; i++) {
//             boolean[] seen = new boolean[128]; 
//             int cnt = 0;
            
//             for (int j = i; j < n; j++) {
//                 if (seen[chars[j]]) {
//                     break;
//                 }
//                 seen[chars[j]] = true;
//                 cnt++;
//                 max = Math.max(max, cnt);
//             }
//         }
        
//         return max;
//     }
// }




