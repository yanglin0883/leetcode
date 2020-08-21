class Solution {
    public int maxJumps(int[] arr, int d) {
        int max=0;
        maxStep = new int[arr.length];
        Arrays.fill(maxStep, -1);
        for(int i=0;i<arr.length;i++){
            max = Math.max(dfs(arr, d, i), max);
            // System.out.println("main runs "+max+" i= "+i);
        }
        //for(int i=0;i<arr.length;i++)System.out.print(maxStep[i]+"  ");
        return max+1;
    }
    int[] maxStep;
    int dfs(int[]arr, int d, int start){
        if(maxStep[start]!=-1) return maxStep[start];
        int max = 0;
        for(int i=start+1;i<=start+d&&i<arr.length&&arr[i]<arr[start];i++){
            max = Math.max(max, 1+dfs(arr, d, i));
            //System.out.println(i+"  "+max);
        }
        for(int i=start-1;i>=start-d&&i>-1&&arr[i]<arr[start];i--){
            max = Math.max(max, 1+dfs(arr, d, i));
        }
        //System.out.println("index "+start+" "+max);
        maxStep[start] = max;
        return maxStep[start];
    }
}