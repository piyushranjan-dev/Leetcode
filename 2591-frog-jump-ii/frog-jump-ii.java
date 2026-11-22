class Solution {
    public int maxJump(int[] stones) {
        if(stones.length==1) return 0;
        int ans=stones[1]-stones[0];
        for(int i=2;i<stones.length;i++){
            ans=Math.max(ans,stones[i]-stones[i-2]);
        }
        return ans;
    }
}