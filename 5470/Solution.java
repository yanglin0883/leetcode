class Solution {
    public int minInsertions(String s) {
        char[] str = s.toCharArray();
        int res=0;
        int left=0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                left++;
            }else{
                if(left>0){  
                    left--;
                    if(i+1>=str.length ||str[i+1]=='(' ){
                        res++;
                    }else{
                        i++;
                    }
                }else{                    
                    if(i+1>=str.length ||str[i+1]=='(' ){
                        res+=2;
                    }else{
                        res++;
                        i++;
                    }
                }
            }
        }
        res += left*2;
        return res;
    }
}