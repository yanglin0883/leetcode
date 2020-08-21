class Solution {
    public String getHint(String secret, String guess) {
        if(secret.equals("")) return "0A0B";
        int sum=0;
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<secret.length();i++){
            char c = secret.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else 
                hm.put(c,1);
        }
        for(int i=0;i<guess.length();i++){
            char c = guess.charAt(i);
            if(hm.containsKey(c)&&hm.get(c)>0) {
                sum++;
                hm.put(c, hm.get(c)-1);
            }
        }
        int bull=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) bull++;
        }
        int cow = sum -bull;
        return bull+"A"+cow+"B";
    }
}