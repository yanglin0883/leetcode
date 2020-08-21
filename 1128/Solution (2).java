class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            int temp =0;
            if(dominoes[i][0]<dominoes[i][1]) temp = 10*dominoes[i][0] + dominoes[i][1];
            else temp = 10*dominoes[i][1] + dominoes[i][0];
            hm.put(temp, hm.getOrDefault(temp,0)+1);
        }
        int count=0;
        //System.out.println(hm.keySet());
        for(Integer i: hm.keySet()){
            int temp = hm.get(i);
            if(temp>1)count += temp * (temp-1)/2;
        }
        return count;
    }
}