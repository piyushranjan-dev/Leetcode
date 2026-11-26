class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int[] i:dp){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
    return helper(dp,triangle,0,0);
    }
    int helper(int[][] dp,List<List<Integer>> triangle,int i,int j){
        if(triangle.size()-1==i){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int d=triangle.get(i).get(j)+helper(dp,triangle,i+1,j);
        int dd=triangle.get(i).get(j)+helper(dp,triangle,i+1,j+1);
        return dp[i][j]=Math.min(d,dd);
    }
}