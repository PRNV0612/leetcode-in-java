import java.util.*;
class Solution {
    public int max(int[] l){
        int max=0;
        int len=l.length;
        for(int i=0;i<len;i++){
            if(l[i]>=max){
                max=l[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res= new ArrayList<>();
        for(int i:candies){
            int count=i+extraCandies;
            if(count>=max(candies)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}