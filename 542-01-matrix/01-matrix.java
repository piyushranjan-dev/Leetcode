class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat.length==0||mat[0].length==0){
            return new int[0][0];
        }
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans=new int[m][n];
        for (int i=0;i<m;i++) {
            Arrays.fill(ans[i],-1);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    ans[i][j]=0;
                }
            }
        }
        int[][] t={
            {-1,0},
            {0,-1},
            {1,0},
            {0,1}
        };
        while(!q.isEmpty()){
            int[] temp=q.poll();
            for(int[] x:t){
                int r=temp[0]+x[0];
                int c=temp[1]+x[1];
                if (r>=0&&r<m&&c>=0&&c<n&&ans[r][c]==-1) {
                    ans[r][c]=ans[temp[0]][temp[1]]+1;
                     q.offer(new int[]{r, c});
                }
            }
        }
        return ans;
    }
}