class Solution {
    public int maxPower(String s) {
        char[] str = s.toCharArray();
        int max=0;
        for(int i=0;i<str.length;i++){
            int j=i;
            for(;j<str.length&&str[j]==str[i];j++);
            max = Math.max(max, j-i);
            // System.out.println(i+"  "+j+" "+max);
        }
        return max;
    }
}