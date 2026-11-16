
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for (int i=0;i<n;i++) {
            boolean[] b=new boolean[32];
            for (int j=i;j<n;j++) {
                String binary=Integer.toBinaryString(nums[j]);
                boolean valid=true;
                for (int k=0;k<binary.length();k++) {
                    int bi=binary.length()-1-k;
                    if (binary.charAt(k)=='1'&&b[bi]){
                        valid=false;
                        break;
                    }
                }
                if(!valid){
                    break;
                }
                for (int k=0;k<binary.length();k++){
                    int bit=binary.length()-1-k;
                    if (binary.charAt(k)=='1') {
                        b[bit]=true;
                    }
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
