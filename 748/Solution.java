class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] l = toArr(licensePlate);
        int res=-1;
        T:for(int i=0;i<words.length;i++){
            int[] t = toArr(words[i]);
            for(int j=0;j<26;j++)
                if(l[j]>t[j]) { System.out.println(j);continue T;}
            if(res==-1||words[i].length()<words[res].length()) res = i;
        }
        return words[res];
    }
    int[] toArr(String s){
        int[] res = new int[26];
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                res[Character.toUpperCase(c)-'A']++;
            }
        }
        return res;
    }
}