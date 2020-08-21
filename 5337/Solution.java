class Solution {
    public int findTheLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int max =0;
        String temp="00000";
        Map<String, Integer> visited = new HashMap<>();
        visited.put(temp, -1);
        for(int i=0;i<str.length;i++){
            temp = getNext(temp, str[i]);
            if(visited.containsKey(temp)){
                int len = i-visited.get(temp);
                max = Math.max(max, len);
            }else{
                visited.put(temp, i);
            }
        }
        return max;
    }
    String getNext(String n, char c){
        char[] temp = n.toCharArray();
        if(c=='a'){
            if(temp[0]=='0')temp[0]='1';
            else temp[0]='0';
            return new String(temp);
        }
        if(c=='e'){
            if(temp[1]=='0')temp[1]='1';
            else temp[1]='0';
            return new String(temp);
        }
        if(c=='i'){
            if(temp[2]=='0')temp[2]='1';
            else temp[2]='0';
            return new String(temp);
        }
        if(c=='o'){
            if(temp[3]=='0')temp[3]='1';
            else temp[3]='0';
            return new String(temp);
        }
        if(c=='u'){
            if(temp[4]=='0')temp[4]='1';
            else temp[4]='0';
            return new String(temp);
        }
        return n;
    }
}