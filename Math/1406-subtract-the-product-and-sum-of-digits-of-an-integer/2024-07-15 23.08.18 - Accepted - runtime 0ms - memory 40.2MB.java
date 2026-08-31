class Solution {
    public int subtractProductAndSum(int n) {
        int product=1,sum=0;
        while(n!=0){
            int remain = n%10;
            product = product*remain;
            sum = sum+remain;
            n=n/10;
        }
        return product-sum;
    }
}