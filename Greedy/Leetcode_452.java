//  Minimum Number of Arrows to Burst Balloons_452

class Solution {
    
    public int findMinArrowShots(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
    // yaha direct a[0]-b[0] karne par error de raha hai. so integer.compare use kiye hai.
        
        int s=arr[0][1];
        int count=1;
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i][0] +" "+arr[i][1]);
        // }
        
        for(int i=1;i<arr.length;i++){
            
            int e=arr[i][0];
            if(s<e){
                count++;
                s=arr[i][1];
            }
        }
        return count;
    }
}
