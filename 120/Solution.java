class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null||triangle.size()==0) return 0;
        int[][] map = new int[triangle.size()][triangle.size()];
        map[0][0] = triangle.get(0).get(0);
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    map[i][j] = map[i-1][j]+triangle.get(i).get(j);
                else if(j<i){
                    map[i][j] = Math.min(map[i-1][j], map[i-1][j-1])+triangle.get(i).get(j);
                }
                else map[i][j] = map[i-1][j-1]+triangle.get(i).get(j);
            }
            //print(map);
        }
        int min = map[triangle.size()-1][0];
        for(int i=0;i<triangle.size();i++)
            min = Math.min(min, map[triangle.size()-1][i]);
        return min;
    }
    // void print(int[][] a){
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[0].length;j++)
    //             System.out.print(a[i][j]+"  ");
    //         System.out.println();
    //     }
    //     System.out.println();
    // }
}