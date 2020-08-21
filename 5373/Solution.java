class Solution {
    public int findMinFibonacciNumbers(int k) {
        if(k<2) return k;
        ArrayList<Integer> f = new ArrayList();
        f.add(1);
        f.add(1);
        for(;f.get(f.size()-1)<k;){
            f.add(f.get(f.size()-1)+f.get(f.size()-2));
        }
        int n=0;
        for(int i=f.size()-1;i>-1;i--){
            if(k==0) return n;
            if(k<f.get(i))continue;
            k-=f.get(i);
            n++;
        }
        return n;
    }
}