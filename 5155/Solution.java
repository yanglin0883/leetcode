class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> tm = new TreeMap();
        for(int i:arr){
            tm.put(i, 0);
        }
        int index=1;
        for(Integer i: tm.keySet()){
            tm.put(i, index++);
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            res[i] = tm.get(arr[i]);
        return res;
    }
}