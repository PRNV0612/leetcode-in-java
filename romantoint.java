//Question 13


import java.util.HashMap;
import java.util.Map;

public class romantoint {
    public static int romanToInt(String s) {
        int n=s.length();
        Map<Character,Integer> roman= new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int ans=0;
        int i=0;
        while(i<n){
            int a=roman.get(s.charAt(i));
            try{
                if(i+1>=n){
                    ans+=a;
                    break;
                }
                if(a<roman.get(s.charAt(i+1))){
                    ans+=roman.get(s.charAt(i+1))-a;
                    i=i+2;
                }
                else{
                    ans+=a;
                    i++;
                }
            }
            catch(Exception e){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}    

