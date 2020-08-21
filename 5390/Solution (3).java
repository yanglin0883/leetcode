class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] v = new int[5];
        for(char i: croakOfFrogs.toCharArray()){
            if(i=='c'){
                v[0]++;
                v[4] = Math.max(0, v[4]-1);
            }
            else if(i=='r'){
                if(v[0]==0) return -1;
                v[0]--;v[1]++;
            }
            else if(i=='o'){
                if(v[1]==0) return -1;
                v[1]--;v[2]++;
            }
            else if(i=='a'){
                if(v[2]==0) return -1;
                v[2]--;v[3]++;
            }
            else if(i=='k'){
                if(v[3]==0) return -1;
                v[3]--;v[4]++;
            }
        }
        if(v[0]>0||v[1]>0||v[2]>0||v[3]>0) return -1;
        return v[4];
    }
}