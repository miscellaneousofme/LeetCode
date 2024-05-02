class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        if(x<0 || x%10 == 0 && x !=0){
            return false;
        }
        while(num !=0){
            int a = num%10;
            rev = rev*10+a;
            num= num/10;
        }
        if(rev == x){
            return true;
        }
        else return false;
    }
}