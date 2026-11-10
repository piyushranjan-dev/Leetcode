class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] row:intervals){
            list.add(row);
        }
        list.add(newInterval);
        int[][] arr=list.toArray(new int[0][]);
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        l.add(new ArrayList<>(Arrays.asList(arr[0][0],arr[0][1])));
        for(int i=1;i<arr.length;i++){
            int last=l.size()-1;
            if(l.get(last).get(1)>=arr[i][0]) {
                l.get(last).set(1,Math.max(l.get(last).get(1),arr[i][1]));
            }else{
                l.add(new ArrayList<>(Arrays.asList(arr[i][0],arr[i][1])));
            }
        }
        int[][] arr1=new int[l.size()][];
        for(int i=0;i<l.size();i++) {
            arr1[i] = new int[l.get(i).size()];
            for(int j=0;j<l.get(i).size();j++){
                arr1[i][j]=l.get(i).get(j);
            }
        }
        return arr1;
    }
}