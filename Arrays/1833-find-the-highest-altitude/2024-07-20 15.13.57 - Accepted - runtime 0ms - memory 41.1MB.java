class Solution {
    public int largestAltitude(int[] gain) {
        int[] psum=new int[gain.length];
        psum[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            psum[i]=psum[i-1]+gain[i];

        }
        int max=psum[0];
        for(int i=1;i<psum.length;i++){
            max=Math.max(max,psum[i]);

        }if(max<0) return 0;
        return max;
        
    }
}