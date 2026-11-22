class Solution {
    public long minCost(int[] nums) {
       int n = nums.length;
        long total=(long)nums[0]+nums[n-1];
        int m =n-2;
        if(m<2){
            return total;
        }
        int[]mid = new int[m];
        for(int i=1;i<n-1;i++){
            mid[i-1]= nums[i];
        }
        Arrays.sort(mid);
        for(int i=0;i+1<m;i+=2){
            long s=(long)mid[i]+mid[i+1];
            if(s<0){
                total = total+s;
            }  else{
                break;
            }
        }
        return total;
            
    }
}