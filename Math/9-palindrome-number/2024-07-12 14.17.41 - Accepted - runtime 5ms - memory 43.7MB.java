class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r=0;
        int ans = x;
        while(x>0){
            int n = x % 10;
            r = r * 10 + n;
            x = x/10;
        }
        return r==ans;
    }
}