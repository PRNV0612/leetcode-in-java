class Reversevowel {
    public String reverseVowels(String s) {
        char[] charArr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(isvowel(charArr[i])){
                while(i<j){
                    if(isvowel(charArr[j])){
                        char temp=charArr[j];
                        charArr[j]=charArr[i];
                        charArr[i]=temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return new String(charArr);
    }

    public boolean isvowel(char a){
       return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
       || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') ? true : false;
    }
}