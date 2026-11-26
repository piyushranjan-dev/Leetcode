class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n=maze.length;
        int m=maze[0].length;
        int[][] visited=new int[n][m];
        int x=entrance[0];
        int y=entrance[1];
        Queue<int[]> q=new LinkedList<>();
        visited[x][y]=1;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        q.offer(new int[]{x,y,0});
        while(!q.isEmpty()){
            int[] curr=q.remove();
            int x1=curr[0];
            int x2=curr[1];
             int count=curr[2]; 
            if((x1==0||x2==0||x1==n-1||x2==m-1)&&(x1!=x||x2!=y)) return count;
            for(int i=0;i<4;i++){
                int nr=x1+dr[i];
                int nc=x2+dc[i];
                if(nr>=0&&nc>=0&&nr<n&&nc<m&&maze[nr][nc]=='.'&&visited[nr][nc]==0){
                    visited[nr][nc]=1;
                    q.offer(new int[]{nr,nc,count+1});
                }
            }
        }
        return -1;
    }
}