class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
       Integer[][] dp=new Integer[n][m];
      int ans=Integer.MAX_VALUE;
      for(int i=0;i<m;i++){
        ans=Math.min(ans,helper(matrix,n,m,dp,0,i));
      }
      return ans;
    }
    int helper(int[][] matrix,int n,int m,Integer[][] dp,int i,int j){
        if(j<0||j>=m) return Integer.MAX_VALUE;
        if(i==n-1) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
       int l=helper(matrix,n,m,dp,i+1,j-1);
        int c=helper(matrix,n,m,dp,i+1,j);
         int r=helper(matrix,n,m,dp,i+1,j+1);
         int ans=matrix[i][j]+Math.min(l,Math.min(c,r));
         return dp[i][j]=ans;
    }
}