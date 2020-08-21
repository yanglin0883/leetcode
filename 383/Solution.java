class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] c = new int[128];
        for(char i : magazine.toCharArray()){
            c[i]++;
        }
        for(char i : ransomNote.toCharArray()){
            c[i]--;
        }
        for(int i:c)
            if(i<0) return false;
        return true;
    }
}