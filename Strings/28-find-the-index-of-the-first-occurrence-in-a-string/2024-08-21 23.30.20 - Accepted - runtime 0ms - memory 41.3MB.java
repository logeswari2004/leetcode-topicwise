class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();
        int index=0;
        for(int i=0;i<hlen;i++){
            if(haystack.charAt(i)==needle.charAt(index)){
                index++;
            }else{
                i=i-index;
                index=0;
            }
            if(index==nlen){
                return i-nlen+1;
            }
        }
        return -1;
    }
}