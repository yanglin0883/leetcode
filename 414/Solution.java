class Solution {
    public int thirdMax(int[] nums) {
        ThirdM max = new ThirdM();
        for(int i:nums){
            max.fill(i);
            //System.out.println(max.filled);
        }
        return max.getBig3();
    }
    
    private class ThirdM{
        int biggest[] = new int[4];
        int filled=0;
        void fill(int a){
            if(contains(a)) return;
            biggest[filled] = a;            
            sort();
            filled++;
            if(filled>3)filled=3;
        }
        
        boolean contains(int a){
            for(int i=0;i<filled;i++)
                if(biggest[i]==a) return true;
            return false;
        }
        
        void sort(){
            for(int i=0;i<=filled;i++){
                for(int j=i+1;j<=filled;j++){
                    if(biggest[i]<biggest[j]) {
                        int temp = biggest[i];
                        biggest[i] = biggest[j];
                        biggest[j] = temp;
                    }
                }
            }
        }
        
        int getBig3(){
            if(filled>=3) return biggest[2];
            else return biggest[0];
        }
    }
}