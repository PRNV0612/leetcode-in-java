//73. Set Matrix Zeros
/*
 * We will not be using any extra space to monitor the rows and columns,
 * instead we will modify the firts row and column in case a 0 is present.
 * we will also keep two variables first row and firstcol to check if there is a 0 in either
 * the first row or column brfore we make any further changes.
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false,firstCol=false;
        
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRow=true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRow){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}