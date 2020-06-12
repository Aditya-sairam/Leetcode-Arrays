//return the minimum size of the contegious array nums such that sum opf that array >= s
class MinSizeSum {
    public int minSubArrayLen(int s, int[] nums) {
        int answer = Integer.MAX_VALUE;
        
        int n = nums.length; 
        int sumo = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            sumo += nums[i];
            
            while(sumo >= s){
                answer = Math.min(answer,i+1-left);
                sumo -= nums[left++];
            }
        }
        if(answer == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return answer;
        }
        
    }
}
