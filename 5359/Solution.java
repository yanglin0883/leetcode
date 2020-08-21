class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[] temp = new int[k];
        long[] res = new long[1];
        this.sp = speed;
        this.ef = efficiency;
        dfs(0, temp,0,n, res);
        // System.out.println(map);
        return (int)(res[0]%1000000007);
    }
    int sp[], ef[];
    Map<String, Long> map = new HashMap();
    void dfs(int start, int[] temp,int cur, int n, long[] res){
        if(start<=temp.length){
            String label = getString(start, temp);
            if(map.containsKey(label))  res[0] = Math.max(res[0], map.get(label));
            else {
                long t = toNum(start, temp);
                res[0] = Math.max(res[0], t);
                map.put(label, t);
            }
        }
        if(temp.length==start) return;
        for(int i=cur;i<n;i++){
            temp[start] = i;
            dfs(start+1, temp, i+1,n,res);
        }
    }
    
    String getString(int len, int[] temp){
        int[] a = new int[len];
        for(int i=0;i<a.length;i++)a[i] = temp[i];
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for(int i:a){
            sb.append(i);
            sb.append(",");
        }
        return sb.toString();
    }
    
    long toNum(int len, int[] temp){
        int min = Integer.MAX_VALUE;
        long res =0;
        for(int i=0;i<len;i++){
            min = Math.min(min, ef[temp[i]]);
            res = res+sp[temp[i]];
        }
        res = res* min;
        return res;
    }
}