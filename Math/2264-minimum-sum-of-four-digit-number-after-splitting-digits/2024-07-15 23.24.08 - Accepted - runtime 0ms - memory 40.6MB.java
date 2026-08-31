class Solution {
    public int minimumSum(int num) {
        int n=0;
        int arr[]=new int[4];
        while(num>0){
            arr[n]=num%10;
            num=num/10;
            n++;
        }
        Arrays.sort(arr);
        int num1=arr[0]*10+arr[2];
        int num2=arr[1]*10+arr[3];
        return num1+num2;
    }
}