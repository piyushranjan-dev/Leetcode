class Solution {
    int[][] grid;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.grid=obstacleGrid;
      int m = grid.length;
        int n = grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return helper(m,n,0,0, grid,dp);
    }
    public int helper(int m,int n,int i,int j,int[][] grid,int[][] dp){
            
            if(i>=m||j>=n||grid[i][j]==1){
                return 0;
            }
            //  if(grid[i][j]==1){
            //     return 0;
            // }
            if(i==m-1&&j==n-1){
                return 1;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
           
            int forward=helper(m,n,i,j+1,grid,dp);
            int downward=helper(m,n,i+1,j,grid,dp);
            return dp[i][j]=forward+downward;
 
    }
}