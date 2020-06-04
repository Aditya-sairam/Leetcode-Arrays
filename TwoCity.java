class TwoCity {
    public int twoCitySchedCost(int[][] costs) {
        
        int N = costs.length/2;
        
        Comparator<int[]> comparator = (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]); 
        
        Arrays.sort(costs,comparator);
        int cost1 = 0;
    int cost2 = 0;
    int i = 0;
    int tot = 0;
        while(i<2*N){
            if((costs[i][0] < costs[i][1] && cost1 < N) || cost2 == N){
                tot += costs[i++][0];
                cost1 += 1;
            }
            else{
                tot += costs[i++][1];
                cost2 += 1;
            }
        }
        return tot;
    }
}
