//Question 9

class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false; 

        int temp = x;
        int reversed = 0;
        
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        
        return x == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(54)); // should print false
        System.out.println(isPalindrome(121)); // should print true
    }
}
