class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> hs = new HashSet();
        int e = 100000;
        hs.add(0);
        int x=0, y=0;
        for(char c: path.toCharArray()){
            switch(c){
                case 'N':y++;break;
                case 'S':y--;break;
                case 'W':x--;break;
                case 'E':x++;
            }
            int cur = x*e + y;
            if(hs.contains(cur)) return true;
            hs.add(cur);
        }
        return false;
    }
}