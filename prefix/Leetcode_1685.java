// Sum of Absolute Differences in a Sorted Array_1685
// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/

class Solution {            
    
    public int[] getSumAbsoluteDifferences(int[] arr) {
        
        int n=arr.length;
        int prefix[]=new int[n];
        int total=0;
        
        prefix[0]=arr[0];
        total+=arr[0];
        
        int ans[]=new int[n];
        
        for(int i=1;i<n;i++){
            total+= arr[i];
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        System.out.print(Arrays.toString(prefix));
        
        for(int i=0;i<n;i++){
            
            int val= arr[i]*(i+1);
            int rem_val= arr[i]*(n-1-i);  // remaining val
            
            int leftsum= val-prefix[i];
            int rightsum= (total-prefix[i])-rem_val;
            
            ans[i]=leftsum+rightsum;
            
        }
        return ans;
    }
}
