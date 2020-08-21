class Solution {
    public int rotatedDigits(int N) {
        int c=0;
        for(int i=1;i<=N;i++)
            if(isGood(i)){
                c++;
                // System.out.println(i);
            }
        return c;
    }
    private boolean isGood(int n){        
        int[] digits= new int[4];
        int len=0;
        int temp=n;
        while(temp!=0){
            digits[len++] = temp%10;
            temp/=10;
        }
        boolean changed=false;
        for(int i=0;i<len;i++){
            switch(digits[i]){
                case 3: case 4: case 7: return false;
                case 2: case 5: case 6: case 9: changed=true;
            }
        }
        return changed;
    }
}