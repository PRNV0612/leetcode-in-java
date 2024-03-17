
class Solution {
    public static int gcd(int l1,int l2){
        if(l2==0) return l1;
        else{
            return gcd(l2,l1%l2);
        }
    }

    public static String gcdOfStrings(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();   
        StringBuilder str=new StringBuilder();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        else if (str1.equals(str2)) {
                return str1;
        }
        if(m>n){
            int a=gcd(m,n);
            str.append(str1.substring(0,a));
        }
        else if(n>m){
            int a=gcd(n,m);
            str.append(str2.substring(0,a));
        }
        else{
            return "";
        }
        return str.toString();

    }
}