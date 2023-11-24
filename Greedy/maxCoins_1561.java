// 1561. Maximum Number of Coins You Can Get
// https://leetcode.com/problems/maximum-number-of-coins-you-can-get/


class Solution {            // own solution 
    
    public int maxCoins(int[] arr) {
        
        Arrays.sort(arr);
        
        int i=0;
        int j=arr.length-2;
        int count=0;
        
        while(i<j){
            
            count+=arr[j];
            i++;
            j=j-2;
        }
        
        return count;
    }
}
