class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] fu = IntStream.of(rains).map(i->i>0?-1:i).toArray();
        Map<Integer, Integer> deng = new HashMap();
        TreeSet<Integer> pan = new TreeSet();
        for(int i=0;i<rains.length;i++){
            if(rains[i] >0){
                if(deng.containsKey(rains[i])){
                    Integer rj = pan.higher(deng.get(rains[i]));
                    if(rj==null) return new int[0];
                    pan.remove(rj);
                    fu[rj] = rains[i];
                }
                deng.put(rains[i], i);
            }else{
                pan.add(i);
            }
        }
        for(int i=0;i<fu.length;i++)
            if(fu[i]==0)
                fu[i] = rains.length-1;
        return fu;
    }
}