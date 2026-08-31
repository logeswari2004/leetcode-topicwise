class Solution {
    public int maxVowels(String s, int k) {
       int n=s.length();
        int mcount=-99999;
        int count=0;
       String st= "aeiou";

        for(int i=0;i<k;i++){
            if(st.indexOf(s.charAt(i))>=0){
                count++;
            }
        }
        mcount = Math.max(count,mcount);
        for(int i=k;i<n;i++){
            if(st.indexOf(s.charAt(i-k))>=0) count--;
            if(st.indexOf(s.charAt(i))>=0) count++;
            mcount = Math.max(mcount,count);
        }
        return mcount;
    }
}