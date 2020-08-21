class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> groups = new HashSet<>();
        for(String s:A){
            int[] count = new int[52];
            for(int i=0;i<s.length();i++)
                count[s.charAt(i)-'a'+i%2*26]++;
            groups.add(Arrays.toString(count));
        }
        return groups.size();
    }
}