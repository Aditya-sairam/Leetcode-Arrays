# SUbarray with given sum-geeksforgeeks

arr = list(map(int,input().split()))
p = int(input()) 

i,j = 0,0 
n = len(arr)

while(j<n):
    sumo = sum(arr[i:j])
    if(sumo == p):
        print(i+1)
        print(j)
        break 
    if sumo < p:
        j+=1 
    else:
        i+=1 
        
