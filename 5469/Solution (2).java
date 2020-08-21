class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length()) return false;
        int[] n = new int[s.length()];
        Set<Integer> set = new HashSet();
        for(int i=0;i<s.length();i++){
            n[i]=get(s.charAt(i), t.charAt(i));
        }
        // System.out.println(Arrays.toString(n));
        int[] letters = new int[26];
        for(int i:n){
            if(i!=0)
            letters[i]++;
        }
        // System.out.println(Arrays.toString(letters));
        for(int i=0;i<26;i++){
            if((letters[i]-1)*26+i > k) return false;
        }
        return true;
    }
    int get(char a, char b){
        int res = ((int)(b-a)+26)%26;
        // System.out.println(res);
        return res;
    }
}