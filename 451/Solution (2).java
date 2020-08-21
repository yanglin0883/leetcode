class Solution {
    public String frequencySort(String s) {
        int[][] letters = new int[128][2];
        for(int i=0;i<128;i++)
            letters[i][0] = i;
        for(char c: s.toCharArray())
            letters[(int)c][1]++;
        Arrays.sort(letters,(a, b)->b[1]-a[1]);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<128;i++){
            for(int j=0;j<letters[i][1];j++){
                res.append((char)letters[i][0]);
            }
        }
        return res.toString();
    }
}