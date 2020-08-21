class Solution {
//* stands for zero or more chars
    public boolean isMatch(String s, String p) {
        if(s.length()==0&&p.length()!=0){
            int stars=0;
            for(int i=0;i<p.length();i++)
                if(p.charAt(i)=='*') stars++;
            return stars==p.length();
        }
        int i=0,j=0;
        while(i<s.length()){
            if(j>=p.length()) return false;
            if(p.charAt(j)=='.'){
                i++; j++;
            }
            else if(p.charAt(j)=='*'){
                int start = j+1, dots=0;
                while(start<p.length() && (p.charAt(start)=='*'||p.charAt(start)=='.')) {start++;if(p.charAt(start)=='.')dots++;}
            
                if(start>=p.length()) return true;
                int end = start;
                for(;end<p.length();end++){
                    if(p.charAt(end)=='.' || p.charAt(end)=='*') break;
                }
                String label = p.substring(start, end);
                for(int k=i;k<s.length();){
                    int res = s.indexOf(label, k);
                    if(res==-1)break;
                    k = res+end-start;
                    if(isMatch(s.substring(res, s.length()), p.substring(start,p.length()))) return true;
                }
                return false;
            }
            else{
                if(s.charAt(i++)!=p.charAt(j++)) return false;                
            }
        }
        return true;
    }
}