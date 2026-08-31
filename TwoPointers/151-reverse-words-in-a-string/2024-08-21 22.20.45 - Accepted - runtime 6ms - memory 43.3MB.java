class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        int n=s.length();
        StringBuilder res = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            res.append(str[i]);
            if (i != 0) { 
                res.append(" ");
            }
        }
        return res.toString();
    }
}