class Solution {
    public int numberOfSubstrings(String s) {
        int sum=0;
        char[] str = s.toCharArray();
        for(int i=0;i<str.length-2;i++){
            boolean a=false, b=false, c=false;
            for(int j=i;j<str.length;j++){
                if(str[j]=='a')a= true;
                if(str[j]=='b')b=true;
                if(str[j]=='c')c= true;
                if(a&&b&&c){
                    sum += str.length-j;
                    break;
                }
            }
        }
        return sum;
    }
}