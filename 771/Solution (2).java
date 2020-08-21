class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hm = new HashSet();
        for(int i=0;i<J.length();i++){
            hm.add(J.charAt(i));
        }
        int counter = 0;
        for(int i=0;i<S.length();i++){
            if(hm.contains(S.charAt(i))) counter++;
        }
        return counter;
    }
}