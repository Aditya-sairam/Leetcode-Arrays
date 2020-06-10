// change values of rows and columns to 0 in matrix-leetcode problem 

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row = len(matrix)
        cols = len(matrix[0])
        
        rowset,colset = set(),set()
        for i in range(row):
            for j in range(cols):
                if matrix[i][j] == 0:
                    rowset.add(i)
                    colset.add(j) 
                    
        
        for i in range(row):
            for j in range(cols):
                if i in rowset or j in colset:
                    matrix[i][j] = 0
