class maximumProduct {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int max_ending = 0;
        int min_ending = 0;
        int max_so_far = 0;
        
        for(int i : nums){
            int temp = max_ending; 
            
            max_ending = Integer.max(i,Integer.max(i*max_ending,i*min_ending));
            
            min_ending = Integer.min(i,Integer.min(i*temp,i*min_ending));
            
            max_so_far = Integer.max(max_so_far,max_ending);
        }
        
        return max_so_far;
    }
}
