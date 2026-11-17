class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0) return "";
        String arr=strs[0]; 
        for (int i=1;i<strs.length;i++) {
            while(!strs[i].startsWith(arr)) {
                arr= arr.substring(0,arr.length() - 1);
                if (arr.isEmpty()) return ""; 
            }
        }
        return arr;
    }
}
