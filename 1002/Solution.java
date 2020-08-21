class Solution {
    public List<String> commonChars(String[] A) {
        int[][] ch = new int[A.length][26];
        for(int i=0;i<A.length;i++){
            for(char t : A[i].toCharArray())
                ch[i][t-'a']++;
        }
        List<String> res = new ArrayList<String>();
        for(int i=0;i<26;i++){
            int min =100;
            for(int j=0;j<A.length;j++)
                min = Math.min(min, ch[j][i]);
            String temp = new String(""+(char)('a'+i));
            for(int j=0;j<min;j++)
                res.add(temp);
        }
        return res;
    }
}