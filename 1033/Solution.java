class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int input[] = {a,b,c};
        Arrays.sort(input);
        int[] res = new int[2];
        res[1] = input[2] - input[1]-1 + input[1] - input[0]-1;
        if(input[2]-input[0]==2) res[0]=0;
        else if(input[2]-input[1]<=2||input[1]-input[0]<=2) res[0] = 1;
        else res[0] =2;
        return res;
    }
}