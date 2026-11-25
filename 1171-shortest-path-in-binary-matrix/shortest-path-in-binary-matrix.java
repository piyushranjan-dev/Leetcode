class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1) return -1;
        boolean[][] vi=new boolean[n][n];
        int[] dr={-1,-1,0,1,1,1,0,-1};
        int[] dc={0,1,1,1,0,-1,-1,-1};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0,1});
        vi[0][0]=true;
        while(!q.isEmpty()){
            int[] pre=q.poll();
            int r=pre[0];
            int c=pre[1];
            int count=pre[2];
            if(r==n-1&&c==n-1) return count;
           
            for(int i=0;i<dr.length;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
            
            if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0&&!vi[nr][nc]){
                vi[nr][nc]=true;
                q.offer(new int[]{nr,nc,count+1});
            }
        }
        } 
        return -1;
    }
}