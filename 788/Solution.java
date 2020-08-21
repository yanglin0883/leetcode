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
        // switch(n%10){
        //     case 3:case 4:case 7: case 0: return false;                
        // }
        int[] digits= new int[4];
        int len=0;
        int temp=n;
        while(temp!=0){
            digits[len++] = temp%10;
            temp/=10;
        }
        for(int i=0;i<len;i++){
            switch(digits[i]){
                case 3: case 4: case 7: return false;
            }
        }
        int res= 0;
        for(int i=len-1;i>-1;i--){
            res*=10;
            res+=trans(digits[i]);            
        }
        // System.out.println("res= "+res);
        return res!=n;
    }
    
    private int trans(int a){
        switch(a){
            case 0: return 0; case 1: return 1; case 8: return 8;
            case 2: return 5; case 5: return 2; case 6: return 9;case 9: return 6;
            default: return -1;
        }
    }
}