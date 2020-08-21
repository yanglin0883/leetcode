class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer>hm = new HashMap<>();
        for(int i: deck)
            hm.put(i, hm.getOrDefault(i,0)+1);
        Integer gcd=1;
        boolean first = true;
        for(Integer i:hm.keySet()){
            if(first){
                gcd = hm.get(i);
                first = false;
                
            }
            else 
                gcd = GCD(gcd, hm.get(i));
            if(gcd<2) return false;
        }
        
        return true;
    }
    private Integer GCD(Integer m, Integer n){
        if(m%n==0) return n;
        else if(m<n) return GCD(n,m);
        else return GCD(n, m%n);
    }
}