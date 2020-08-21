class Solution {
    public int lastStoneWeight(int[] stones) {
        while(true){
            int[] a = get(stones);
            if(a[0]==-1) return 0;
            int[] b = get(stones);
            if(b[0]==-1) return a[1];
            if(a[1]==b[1]){
                stones[a[0]] = 0;
                stones[b[0]] = 0;
            }
            else {
                stones[a[0]] = Math.abs(a[1] - b[1]);
                stones[b[0]] = 0;
            }
            //System.out.println(a+"  "+b);
        }
    }
    private int[] get(int[] s){
        int index=-1;
        for(int i=0;i<s.length;i++){
            if(s[i]==0) continue;
            if(index==-1||s[index]<s[i]) 
                index = i;
        }
        int[] res = {index,0};
        if(index!=-1){res[1] = s[index];s[index] = 0;}
        return res;
    }
}