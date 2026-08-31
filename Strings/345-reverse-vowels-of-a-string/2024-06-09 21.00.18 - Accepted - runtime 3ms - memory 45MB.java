class Solution {
    public String reverseVowels(String s) {
       int left = 0;
       int right = s.length()-1;
       char[] ans = s.toCharArray();
       String vowels = "aeiouAEIOU";
       while(left<right){
        while(left<right && vowels.indexOf(ans[left])==-1){
            left++;
        }
        while(left<right && vowels.indexOf(ans[right])==-1){
            right--;
        }
        char temp = ans[left];
        ans[left] = ans[right];
        ans[right] = temp;
        left++;
        right--;
       }
       String res = new String(ans);
       return res;
    }
}