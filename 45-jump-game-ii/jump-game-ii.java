class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int j=0;
        // if(nums.length==1) return 0;
        // if(nums[0]!=0&&nums.length>=1){
        //     l=1;
        //     r=nums[0];
        //     j=1;
        // }
        int c=0;
        while(r<nums.length-1){
            c++;
            int f=0;
            for(int i=l;i<=r;i++){
                f=Math.max(f,i+nums[i]);
            }
            l=r+1;
           
            r=f;
            j++;
        }
        System.out.print(c);
        return j;
    }
}