class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char i: s.toCharArray()){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else 
                hm.put(i, 1);
        }
        for(char i : t.toCharArray()){
            if(hm.containsKey(i) && hm.get(i)>0)
                hm.put(i, hm.get(i)-1);
            else 
                return i;
        }
        return ' ';
    }
}