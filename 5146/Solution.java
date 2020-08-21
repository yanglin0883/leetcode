class Solution {
    public int distinctEchoSubstrings(String text) {
        int res=0;
        Set<String> visited = new HashSet<>();
        int len = text.length();
        for(int i=0;i<len;i++){
            for(int j=i+2;j<=len;j+=2){
                String temp = text.substring(i, j);
                if(visited.contains(temp)) continue;
                int t = temp.length()/2;
                if(temp.substring(0,t).equals(temp.substring(t, t*2))) {
                    res++;
                    visited.add(temp);
                    //System.out.println(visited+"   "+i+"  "+j);
                }
            }
        }
        return res;
    }
}