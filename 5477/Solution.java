class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        for(int i:arr)max = Math.max(max, i);
        if(k>=arr.length){
            return max;
        }
        int res = Math.max(arr[0], arr[1]);
        int win = 1;
                if(win==k) return res;
        for(int i=2;i<arr.length;i++){
            if(res>arr[i]){
                win++;
                if(win==k) return res;
            }else{
                res = arr[i];
                win=1;
            }
        }
        return res;
    }
}