# String matching substring is present in list or not
class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        
        a = []
        
        for i in words:
            for j in words:
                if i in j and i!=j and i not in a:
                    a.append(i)
                    
        return a
