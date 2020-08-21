class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        if(s==null||s.length()==0) return  res;
        String[] words = s.split(" ");
        int max=0;
        for(String i:words){
            if(i.length()>max) max = i.length();
        }
        for(int i=0;i<max;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<words.length;j++){
                if(i<words[j].length())sb.append(words[j].charAt(i));
                else sb.append(' ');
            }
            for(int j=sb.length()-1;j>-1;j--){
                if(sb.charAt(j)!=' ') break;
                sb.deleteCharAt(j);
            }
            res.add(sb.toString());
        }
        return res;
    }
}