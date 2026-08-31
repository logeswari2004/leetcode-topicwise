class Solution {
    public boolean closeStrings(String word1, String word2) {
        int freq[]=new int[26];
        int freq1[]=new int[26];
        for(char ch:word1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if((freq[i] == 0 && freq1[i] != 0)||(freq[i] != 0 && freq1[i] == 0)){
                return false;
            }
        }
        Arrays.sort(freq);
        Arrays.sort(freq1);

        for(int i=0;i<26;i++){
            if(freq[i]!=freq1[i]){
                return false;
            }
        }
        return true;
    }
}