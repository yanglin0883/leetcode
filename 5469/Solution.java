class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length()) return false;
        Set<Integer> set = new HashSet();
        for(int i=0;i<s.length();i++){
            int temp=get(s.charAt(i), t.charAt(i));
            if(temp==0) continue;
            // if(set.contains(temp) || temp>k) return false;
            while(set.contains(temp) && temp<=k){
                temp+= 26;
            }
            if(temp>k) return false;
            set.add(temp);
        }
        return true;
    }
    int get(char a, char b){
        int res = ((int)(b-a)+26)%26;
        // System.out.println(res);
        return res;
    }
}