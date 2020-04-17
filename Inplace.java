//Move all the zeros in an array to the last using inplace transformation
class Solution {
    public void moveZeroes(int[] nums) {
        int lastind = 0;
        
        int n = nums.length;
        int i;
        for(i=0;i<n;i++){
            if(nums[i] != 0){
                nums[lastind++] = nums[i];
            }
        }
        
        for(i=lastind;i<n;i++){
            nums[i] = 0;
        }
        
        
    }
}
