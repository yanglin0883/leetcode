class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count =1;
        It temp = new It(ans);
        for(;count<=n*n;count++){
            ans[temp.i][temp.j] = count;
            temp.next();
        }
        return ans;
    }
    class It{
        int map[][];
        int i=0, j=0;
        int direction = 0;
        It(int ans[][]){
            map = ans;
        }
        void next(){
            for(int a=0;a<2;a++){switch(direction){
                case 1: if(i+1>=map.length||map[i+1][j]>0) turnRight(); else {
                    i++;
                    return;
                }break;
                    case 0: if(j+1>=map.length||map[i][j+1]>0) turnRight(); else {
                    j++;
                    return;
                }break;
                    case 3: if(i-1<0||map[i-1][j]>0) turnRight(); else {
                    i--;
                    return;
                }break;
                    case 2: if(j-1<0||map[i][j-1]>0) turnRight(); else {
                    j--;
                    return;
                }break;
            }}
        }
        void turnRight(){
            direction = (direction +1)%4;
        }
    }
}