
class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        long o=0;
        long ev=1;
        long pr=0;
        long ans=0;
        for (int num:arr){
            pr+=num;
            if (pr%2==0) {
                ans+=o;
                ev++;
            }
            else{
                ans+=ev;
                o++;
            }
            ans%=mod;
        }
        return (int)ans;
    }
}
