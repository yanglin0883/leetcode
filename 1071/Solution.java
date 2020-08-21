class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2)) return str1;
        if(str1=="" || str2==""||str1.charAt(0)!=str2.charAt(0)) return "";
        if(str1.length()<str2.length()){
            String temp= str1;
            str1 = str2;
            str2 = temp;
        }
        int M = str1.length(), N = str2.length(), j=0;
        for(j=0;j<M-N;j+=N){   
            for(int i=0;i<N;i++){
                if(str1.charAt(i+j) != str2.charAt(i)) return "";
            }
        }
        //System.out.println(str1+" "+str2);
        return gcdOfStrings(str1.substring(j, M), str2);
    }
}