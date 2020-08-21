class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0) return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        boolean hasOdd = false;
        int sum =0;
        for(Character c: hm.keySet()){
            int val = hm.get(c);
            if(val%2==1) {
                hasOdd = true;
                sum += val-1;
            }
            else sum += val;
        }
        if(hasOdd) sum ++;
        return sum;
    }
}