class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        if(s==null||s.length()==0) return res;
        int m = s.length(), n=p.length();
        if(m<n) return res;
        int[] pLetters = new int[26];
        for(int i=0;i<n;i++)
            pLetters[p.charAt(i)-'a']++;
        int[] temp = new int[26];
        for(int i=0;i<n;i++){
            temp[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(temp, pLetters)) res.add(0);
        for(int i=1;i<=m-n;i++){
            //System.out.println(i);
            temp[s.charAt(i-1)-'a']--;
            temp[s.charAt(i+n-1)-'a']++;
            if(Arrays.equals(temp, pLetters)) res.add(i);
        }
        return res;
    }
}