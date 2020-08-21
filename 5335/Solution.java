class Solution {
    public int maxStudents(char[][] seats) {
        seat = new ArrayList();
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[0].length;j++){
                if(seats[i][j]=='.') seat.add(new int[]{i, j});
            }
        }
        dfs( 0, new ArrayList<Integer>());
        return max;
    }
    ArrayList<int[]> seat;
    int max=0;
    void dfs( int start, ArrayList<Integer>exist){
        if(start==seat.size()){
            max = Math.max(max, exist.size());
            // System.out.println(exist);
            return;
        }
        if(permitted(start,exist)){
            exist.add(start);
            dfs(start+1, exist);
            exist.remove(exist.size()-1);
        }
        dfs(start+1, exist);
    }
    boolean permitted(int start, ArrayList<Integer>exist){
        int[] cur=seat.get(start);
        for(int i:exist){
            int[]temp = seat.get(i);
            if((temp[0]==cur[0]&&cur[1]==temp[1]+1)||(temp[0]+1==cur[0]&&(temp[1]+1==cur[1]||temp[1]-1==cur[1]))) return false;
        }
        return true;
    }
}