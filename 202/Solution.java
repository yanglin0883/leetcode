class Solution {
    public boolean isHappy(int n) {
        if(n<1) return false;
        if(n==1) return true;
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(n);
        while(true){
            n = toBeHappy(n);
            //System.out.println(n);
            if(n==1) return true;
            if(num.contains(n)) return false;
            num.add(n);
        }
       // return true;
    }
    
    private int toBeHappy(int num){
        int sum = 0;
        while(num>0){
            sum += square(num%10);
            num /= 10;
        }
        return sum;
    }
    private int square(int a){
        return a*a;
    }
}