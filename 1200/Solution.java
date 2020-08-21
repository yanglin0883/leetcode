class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);        
        int len = arr.length-1;
        int[] dif = new int[len];
        for(int i=0;i<len;i++){
            dif[i] = arr[i+1] - arr[i];
        }
        int min =0;
        for(int i=1;i<len;i++){
            if(dif[i]<dif[min]) min = i;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=min;i<len;i++){
            if(dif[i]==dif[min]){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                res.add(temp);
            }
        }
        return res;
    }
}