class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        ArrayList<int[]> al = new ArrayList();
        for(int[] i: people){
            al.add(i[1], i);
        }
        return al.toArray(new int[0][2]);
    }
}