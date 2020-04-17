#Two sum II-Input array is Sorted

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        a = []
        l = 0
        r = len(numbers)-1
        
        while(l<r):
            if(numbers[l]+numbers[r] == target):
                return(l+1,r+1)

            if(numbers[l] + numbers[r] > target):
                r-=1
            
            else:
                l+=1 
                
                
        
        return a
