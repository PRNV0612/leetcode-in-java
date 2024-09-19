//48.Rotate Image

/*
 * given a matrix, we have to rotate the matrix by 90 degrees.
 * 
 * so our approach is going to be:
 * 1. Take transpose of the matrix,element at (i,j)=> (j,i), after which we will get a matrix in which all the elements will be in the intended rows .
 * 2. Next we will, shift the elements in the rows such that element at (j,i) => (j,n-i-1)
 */


 class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;


        //transpose
        for(int i=0;i<n;i++){ 
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //switch order of elements in each row
        for(int row=0;row<n;row++){
            int left=0, right=n-1;

            while(left<right){
                int temp= matrix[row][left];
                matrix[row][left]=matrix[row][right];
                matrix[row][right]=temp;
                left++;
                right--;
            }
        }
    }
}
