class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] n = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            n[i][0] = arr[i];
            n[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(n, (p1, p2)->{
            if(p1[1]==p2[1]) return p1[0]-p2[0];
            return p1[1]-p2[1];
        });
        int[] res = new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i] = n[i][0];
        }
        return res;
    }
}