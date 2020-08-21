class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;
        char c[] = s.toCharArray();
        T1:for(int i=0;i<c.length;i++){
            int j = i;
            while(j<c.length && c[j] == c[i]) j++;
            //System.out.println(i+"  "+j);
            for(int k=j;k<2*j-i;k++)
                if(k>=c.length||c[k] == c[i])continue T1;
            count++;
        }
        return count;
    }
}