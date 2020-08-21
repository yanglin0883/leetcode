class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return check(str1, str2) || check( str2, str1);
    }
     boolean check(char[]str1, char[]str2){         
        for(int i=0;i<str1.length;i++){
            if(str1[i]>str2[i]) return false;
        }
        return true;
     }
}