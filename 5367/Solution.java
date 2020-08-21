class Solution {
    public String longestPrefix(String s) {
        int max=-1;
        char[] str = s.toCharArray();
        for(int i=0;i<str.length-1;i++){
            if(str[i] == str[str.length-1]){
                // System.out.println(i+"  "+s.substring(0, i+1)+"  "+s.substring(str.length-i-1, str.length));
                if(s.substring(0, i+1).equals(s.substring(str.length-i-1, str.length)))
                    max = i;
            }
        }
        return s.substring(0, max+1);
    }
}