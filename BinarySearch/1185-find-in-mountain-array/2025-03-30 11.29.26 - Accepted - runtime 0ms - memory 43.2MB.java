 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = peakIndexInMountainArray(mountainArr,n);
        int firsttry = order_ognostic_binary_search(mountainArr, target, 0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return order_ognostic_binary_search(mountainArr,target,peak+1,n-1);
    }
    public int peakIndexInMountainArray(MountainArray mountainArr,int n) {
        int l=0;
        int r= n-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    static int order_ognostic_binary_search(MountainArray mountainArr,int target, int l, int r){
        
        boolean asc = mountainArr.get(l)<mountainArr.get(r);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(asc){
                if(mountainArr.get(mid)<target){
                    l=mid+1;
                }else{
                    r = mid-1;
                }
            }else{
                if(mountainArr.get(mid)<target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}