class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<time.length;i++){
            int temp = time[i] % 60;
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
        }
        int total =0;        
        for(Integer i : hm.keySet()){
            //System.out.println(i +"  "+total+"  "+hm.get(i));            
            if(i==30 || i==0)
                total += fact(hm.get(i));
            else if(i<30){
                if(hm.containsKey(60-i))
                total += hm.get(i) * hm.get(60-i);
            }
        }
        return total;
    }
    private int fact(Integer N){
        if(N<2) return 0;
        int res=0;
        while(N>0)
            res+= -- N;
        return res;
    }
}