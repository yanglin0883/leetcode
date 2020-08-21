class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int dir = 0;
        int[] current= {0,0};
        int maxDistance =0;
        for(int i=0;i<commands.length;i++){
            if(commands[i]<0){
                if(commands[i]==-1) dir = (dir+1)%4;
                else dir = (dir+3)%4;
                continue;
            }
            int[] temp = {current[0]+direction[dir][0]*commands[i] , 
                          current[1]+direction[dir][1]*commands[i]};
            //System.out.println(temp[0]+", "+temp[1]);
            current = dealObstacles(current, temp, obstacles);             
            maxDistance = Math.max(maxDistance,
                                   distance(current));
            //System.out.println(i+": ("+current[0]+", "+current[1]+")");
        }
        return maxDistance;
    }
    private int distance(int[] a){
        return a[0]*a[0]+a[1]*a[1];
    }
    private int[] dealObstacles(int[] cur, int[] temp, int[][]ob){
        if(ob==null ||ob.length==0) return temp;
        if(cur[0] == temp[0]){
            int sign = 1;
            if(temp[1]<cur[1]) sign=-1;
            for(int i=0;i<ob.length;i++){
                if(ob[i][0] == cur[0]){
                    if(sign*(temp[1] - cur[1])>=sign*(ob[i][1]-cur[1])
                       &&sign*(ob[i][1] - cur[1])>0) 
                        temp[1] = ob[i][1]-sign;
                }
            }
        }
        else{
            int sign = (temp[0]<cur[0])?-1:1;
            for(int i=0;i<ob.length;i++){
                if(ob[i][1] == cur[1]){
                    if(sign*(temp[0] - cur[0])>=sign*(ob[i][0]-cur[0])
                      &&sign*(ob[i][0]-cur[0])>0) 
                        temp[0] = ob[i][0]-sign;
                }
            }
        }
        return temp;
    }
}