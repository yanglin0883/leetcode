class Solution {
    public String frequencySort(String s) {
        int ch[] = new int[256];
        for(char a : s.toCharArray())
            ch[a]++;
        int max=0;
        for(int i=0;i<256;i++)
            max= Math.max(max, ch[i]);
        
        StringBuilder res = new StringBuilder();
        for(int i=max;i>0;i--){
            for(int j=0;j<256;j++)
                if(ch[j]==i)for(int k=0;k<i;k++)res.append((char)j);
        }
        return res.toString();
    }
}