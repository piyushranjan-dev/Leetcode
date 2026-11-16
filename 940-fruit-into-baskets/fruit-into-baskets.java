
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int l=0;
        int mn=0;
        for (int r=0;r<fruits.length;r++){
            m.put(fruits[r],
                m.getOrDefault(fruits[r],0)+1);
            while (m.size()>2){
                m.put(fruits[l],
                    m.get(fruits[l])-1);
                if(m.get(fruits[l])==0) {
                    m.remove(fruits[l]);
                }
                l++;
            }
            mn=Math.max(mn,r-l+1);
        }
        return mn;
    }
}
