class Solution {
    public int differenceOfSums(int n, int m) {
        int nd=0,d=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
              nd=nd+i; 
            }else{
                d=d+i;
            }
        }
        return nd-d;
    }
}