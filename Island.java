class Island {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int per = 0;
        int i,j;
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                if(grid[i][j] == 1){
                per = per+(4-allsides(grid,rows,cols,i,j));
                }
            }
        }
        return per;
        
    
    }
    
    public int allsides(int[][] grid,int rows,int cols,int i,int j){
        int sides = 0;
        if(i>0 && grid[i-1][j] == 1){
            sides++;
        }
        if(j>0 && grid[i][j-1] == 1){
            sides++;
        }
        if(i<rows-1 && grid[i+1][j] == 1){
            sides++;
        }
        if(j<cols-1 && grid[i][j+1] == 1){
            sides++;
        }
        return sides;
    }
}
