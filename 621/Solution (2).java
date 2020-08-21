class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] letters = new int[26];
        for(char c: tasks) letters[c-'A']++;
        Arrays.sort(letters);
        int i=25;
        while(i>-1&&letters[i]==letters[25]) i--;
        return Math.max(tasks.length, letters[25] + n*(letters[25]-1) + 24-i);
    }
}