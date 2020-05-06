#Fair candy swap - LeetCode

class Solution:
    def fairCandySwap(self, A: List[int], B: List[int]) -> List[int]:
        
        sets = set(B)
        
        suma = sum(A)
        sumb = sum(B)
        
        for i in A:
            if i + (sumb - suma)/2 in sets:
                return [i,i+(sumb-suma)/2] 
