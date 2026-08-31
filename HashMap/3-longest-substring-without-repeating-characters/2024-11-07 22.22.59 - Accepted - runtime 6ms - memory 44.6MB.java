class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int length=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=j){
                j=map.get(c)+1;
            }
            length = Math.max(length,i-j+1);
            map.put(c,i);
        }
        return length;
    }
}