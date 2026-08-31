class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumgas=0;
        int sumcost=0;
        for(int g: gas){
            sumgas +=g;
        }
        for(int c:cost){
            sumcost += c;
        }
        if(sumgas<sumcost){
            return -1;
        }
        int start=0;
        int tot=0;
        for(int i=0;i<gas.length;i++){
            tot += gas[i]-cost[i];
            if(tot<0){
                tot=0;
                start=i+1;
            }
        }
        return start;
    }
}