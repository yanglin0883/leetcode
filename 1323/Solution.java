class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> n = new ArrayList<>();
        int a = num;
        while(a>0){
            n.add(a%10);
            a/=10;
        }
        //System.out.println(n);
        int i = n.size()-1;
        for(;i>0;i--){
            if(n.get(i)==6)break;
        }
        n.set(i, 9);
        int res = 0;
        for(i=n.size()-1;i>-1;i--){
            res*=10;
            res+=n.get(i);
        }
        return res;
    }
}