class Solution {
    public String getHappyString(int n, int k) {
        if(n==1)return (k>3)?"":new String(""+(char)('a'+k-1));
        int max=3;
        for(int i=1;i<n;i++)
            max*=2;
        if(k>max) return "";
        StringBuilder sb = new StringBuilder();
        // char[] letters = {'a','b','c'};
        if(k<=max/3)sb.append('a');
        else if(k>max/3*2) {sb.append('c'); k-=max/3*2;}
        else {sb.append('b'); k-=max/3;}
        max/=3;
        while(k>0 && max>1){
            char last =sb.charAt(sb.length()-1);
            // System.out.println(sb.toString()+"  "+k+"  "+max);
            max/=2;
            if(k<=max){
                for(char i='a';i<='c';i++){
                    if(i!=last){
                        sb.append(i);
                        break;
                    }
                }
                
            }else{
                for(char i='c';i>='a';i--){
                    if(i!=last){
                        sb.append(i);
                        break;
                    }
                }
                k-=max;
            }
        }
        return sb.toString();
    }
}