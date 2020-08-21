class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()<2) return new String(s);
        String[]  words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<words.length;i++){
            //System.out.println(";;"+words[i]+"::");
            if(words[i].length()==0)continue;
            StringBuilder temp = new StringBuilder(words[i]);
            res.append(temp.reverse());
            res.append(' ');
        }
        res.deleteCharAt(res.length()-1);
        return new String(res);
    }
}