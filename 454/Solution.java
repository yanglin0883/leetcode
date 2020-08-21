class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;
        if(n==0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                int key = A[i]+B[j];
                map.put(key, map.getOrDefault(key, 0)+1);
            }
        int res=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                int key = -C[i]-D[j];
                if(map.containsKey(key)) res+=map.get(key);
            }
        return res;
    }
}