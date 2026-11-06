class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    int helper(int[] nums,int i,int[] dp){
        if(i>=nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i]&&i+j<nums.length;j++){
           int che=helper(nums,i+j,dp);
        if (che!=Integer.MAX_VALUE){
            ans=Math.min(ans,1+che);
        }
        }
        return dp[i]=ans;
    }
}