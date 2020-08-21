class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        HashSet<Character> current=new HashSet();
        int len = s.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(current.contains(s.charAt(j))){
                    current.clear();
                    break;
                }
                else{
                    current.add(s.charAt(j));
                    if(current.size()>max) max = current.size();
                }
            }
        }
        return max;
    }
}