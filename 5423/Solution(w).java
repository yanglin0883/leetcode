class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        ArrayList<Integer> a = new ArrayList();
        for(int i=0;i<arr.length;){
            int[] res = find(arr, i, target);
            if(res[0]!=-1) a.add(res[0]);
            i = res[1]+1;
        }
        if(a.size()<2) return -1;
        Collections.sort(a);
        // System.out.println(a);
        return a.get(0)+a.get(1);
    }
    int[] find(int[]arr, int cur, int target){
        if(cur>=arr.length) return new int[]{-1, arr.length};
        int i=cur, j=cur, sum=arr[cur];
        int minL=-1;
        while(j<arr.length ){
            while(sum<target && j<arr.length){
                // System.out.println(j);
                if(j+1<arr.length)sum += arr[++j];
                else j++;
            }
            if(sum==target){minL = j-i+1;break;}
            while(sum>target ){
                sum -= arr[i++];
            }
        }
        // System.out.println(cur+" "+j+" "+minL);
        return new int[]{minL, j};        
    }
}