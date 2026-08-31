class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String[] str=s.split(" ");
        String last_size=str[str.length-1];
        int sizee = last_size.length();
        return sizee;
    }
}