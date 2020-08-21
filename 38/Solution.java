class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i=1;i<n;i++){
            ans = say(ans);
        }
        return ans;
    }
    
    String say(String str){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int j=i+1;
            while(j<str.length()&&str.charAt(j)==str.charAt(i)) j++;
            res.append(j-i);
            res.append(str.charAt(i));
            i=j-1;
        }
        return res.toString();
    }
}s