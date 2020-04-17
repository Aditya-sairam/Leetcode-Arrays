//Merging two sorted arrays!
class Sort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j;
        int count = 0;
        for(i=0;i<m;i++){
            nums1[i] = nums1[i];
            count++;
        }
        for(j=0;j<n;j++){
            nums1[count++] = nums2[j];
        }
        
        Arrays.sort(nums1);
        
    }
}
