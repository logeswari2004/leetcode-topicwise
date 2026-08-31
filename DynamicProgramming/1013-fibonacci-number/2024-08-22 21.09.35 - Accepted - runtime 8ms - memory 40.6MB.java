class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int n1=fib(n-1);
        int n2=fib(n-2);
        return n1+n2;
    }
}