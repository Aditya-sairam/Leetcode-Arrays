//3sumclosest java problem

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int i,j,k;
        int result = 0;
    int min = Integer.MAX_VALUE;        
        Arrays.sort(nums);
        for(i=0;i<n;i++){
            j = i+1;
            k = n-1;
            
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if(diff ==  0){
                    return sum;
                }
                if(diff < min){
                    min = diff;
                    result = sum;
                }
                if(sum<=target){
                    j++;
                }
                else{
                    k--;
                }
                
            }
        }
        return result;
        
    }
}
