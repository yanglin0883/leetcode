class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            int val=toNum(words[i].charAt(0));
           // System.out.println(words[i]);
            boolean falg = true;
            for(int j=1;j<words[i].length();j++){
                //System.out.println(val+"  "+toNum(words[i].charAt(j)));
                if(toNum(words[i].charAt(j))!=val){
                    falg=false;
                    break;
                }
            }
            if(falg) res.add(words[i]);
        }
        return res.toArray(new String[res.size()]);
    }
    
    private int toNum(char ch){
        //System.out.println(ch+" ..");
        if(ch<'a') ch = Character.toLowerCase(ch);
        switch(ch){
            case'q':case'w':case'e':case'r':case't':case'y':case'u':case'i':case'o':case'p': return 1;
            case'a':case's':case'd':case'f':case'g':case'h':case'j':case'k':case'l': return 2;
            case'z':case'x':case'c':case'v':case'b':case'n':case'm': return 3;
        }
        return 0;
    }
}