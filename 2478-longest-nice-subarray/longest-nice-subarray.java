
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for (int i=0;i<n;i++){
            int r=0;
            for (int j=i;j<n;j++){
                if ((r&nums[j])!=0){
                    break;
                }
                r=r+nums[j];
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
