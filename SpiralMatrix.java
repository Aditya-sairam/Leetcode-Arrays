//Given a matrix print it in spiral form
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
      
        int i,k=0,l=0;
        
        
        List<Integer> arr = new ArrayList<Integer>();
        if(matrix.length == 0){
            return arr;
        }
          int m = matrix.length;
        int n = matrix[0].length;
        
        while(k<m && l<n){
            for(i=l;i<n;i++){
                arr.add(matrix[k][i]);        
            }
            k++;
            for(i=k;i<m;++i){
                arr.add(matrix[i][n-1]);
            }
            n--;
            if(k<m){
                for(i=n-1;i>=l;i--){
                    arr.add(matrix[m-1][i]);
                }
                 m--;
            }
           
            if(l<n){
                for(i=m-1;i>=k;i--){
                    arr.add(matrix[i][l]);
                }
                l++;
            }
        }
        return arr;
    }
}
