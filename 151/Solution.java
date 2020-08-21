class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        if(s==null||s.length()==0) return "";
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=words.length-1;i>-1;i--){
            if(words[i].equals(""))continue;
            res.append(words[i]);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}