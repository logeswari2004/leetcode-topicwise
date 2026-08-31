class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int[] a=new int[m*n];
        int row=0;
        int column=0;
        boolean up=true;
        while(row<m && column<n){
            if(up){
                while(row>0 && column<n-1){
                    a[i++]=matrix[row][column];
                    row--;
                    column++;
                }
                a[i++]=matrix[row][column];
                if(column==n-1){
                    row++;
                }
                else{
                    column++;
                }
            }
            else{
                while(column>0 && row<m-1){
                    a[i++]=matrix[row][column];
                    column--;
                    row++;
                }
                a[i++]=matrix[row][column];
                if(row==m-1){
                    column++;
                }
                else{
                    row++;
                }
            }
            up=!up;
        }
        return a;
    }
}