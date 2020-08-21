class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> groups = new HashSet<>();
        for(String s:A){
            groups.add(get(s.toCharArray()));
        }
        return groups.size();
    }
    String get(char[] c){
        for(int i=0;i<c.length;i++){
            int min = i;
            for(int j=i+2;j<c.length;j+=2){
                if(c[j]<c[min]) min = j;
            }
            char temp = c[min];
            c[min] = c[i];
            c[i] = temp;
        }
        return new String(c);
    }
}