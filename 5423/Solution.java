class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        ArrayList<int[]> a = new ArrayList();
        int i=0, j=0, sum=arr[0];
        while(j<arr.length){
            // System.out.println(i+" "+j);
            while(sum<target && j<arr.length){
                if(j+1<arr.length) sum+=arr[++j];
                else j++;
            }
            if(sum==target){
                a.add(new int[]{i, j, j-i+1});
                sum -= arr[i++];
            }
            // System.out.println(i+" "+j+" "+sum);
            while(sum>target){
                sum -= arr[i++];
            }
            // System.out.println(i+" "+j+" "+sum);
        }
        for(int[] t:a)System.out.println(Arrays.toString(t));
        if(a.size()<2) return -1;
        Collections.sort(a, (p1, p2)->p1[2]-p2[2]);
        int min = Integer.MAX_VALUE;
        for( i=0;i<a.size() ;i++){
            for( j=i+1;j<a.size() ;j++){
                if(a.get(i)[0]<a.get(j)[0] && a.get(i)[1]<a.get(j)[0] ||a.get(i)[0]>a.get(j)[0] && a.get(j)[1]<a.get(i)[0])
                min = Math.min(min, a.get(i)[2]+a.get(j)[2]);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        else return min;
    }
}
//time limit