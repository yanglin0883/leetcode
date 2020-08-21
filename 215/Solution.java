class Solution {
    public int findKthLargest(int[] nums, int k) {
        KthMax max = new KthMax(k);
        for(int i:nums){
            max.fill(i);
        }
        return max.getKthMax();
    }
    
    private class KthMax{
        int[] big;
        int k=0;
        int filled=0;
        KthMax(int k){
            big = new int[k+1];
            this.k = k;
        }
        
        void fill(int a){
            big[filled] = a;
            sort();
            filled++;
            if(filled>k)filled = k;
        }
        
        void sort(){
            for(int i=0;i<=filled;i++){
                for(int j=i+1;j<=filled;j++)
                    if(big[i]<big[j]){
                        int temp = big[i];
                        big[i] = big[j];
                        big[j] = temp;
                    }
            }
        }
        
        int getKthMax(){
            return big[k-1];
        }
    }
    
}