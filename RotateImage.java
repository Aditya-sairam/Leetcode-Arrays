class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        
        int k = 0;
        int j;
        while(k<n){
            for(j=0;j<n;j++){
                arr[k][j] = matrix[n-1-j][k];
            }
            k++;
        }
        int i;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}
