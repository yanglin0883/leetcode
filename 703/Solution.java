class KthLargest {

    KthMax max;
    public KthLargest(int k, int[] nums) {
        max = new KthMax(k);
        for(int i:nums){
            max.fill(i);
        }
        //return max.getKthMax();
    }
    
    public int add(int val) {
        max.fill(val);
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
            //printBig();
            filled++;
            if(filled>k)filled = k;
        }
        
        void sort(){
            for(int i=0;i<filled;i++){
                if(big[filled]>=big[i]){
                    int temp = big[filled];
                    for(int j=filled;j>i;j--)
                        big[j]= big[j-1];
                    big[i] = temp;
                    return;
                }
            }
        }
        
        void printBig(){
            for(int i=0;i<big.length;i++)
                System.out.print(big[i]+", ");
            System.out.println();
        }
        
        int getKthMax(){
            return big[k-1];
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */