class Solution {
    public int minNumberOfFrogs(String c) {
        int n = c.length();
        if(n%5!=0 || c.charAt(0)!='c')return -1;
        boolean[] visited = new boolean[n];
        int steps=0;
        while(){
            steps++;
        for(int i=0;i<n;i++){
            if(visited[i] || c.charAt(i)!='c')continue;
            int j=i;
            boolean[] croak = new boolean[5];
            for(;j<n;j++){
                if(c.charAt(j)=='c'){
                    visited[j] = true;
                    croak[0] = true;
                    break;
                }
            }
            for(;j<n;j++){
                if(c.charAt(j)=='r'){
                    visited[j] = true;
                    croak[1] = true;
                    break;
                }
            }
            for(;j<n;j++){
                if(c.charAt(j)=='o'){
                    visited[j] = true;
                    croak[2] = true;
                    break;
                }
            }
            for(;j<n;j++){
                if(c.charAt(j)=='a'){
                    visited[j] = true;
                    croak[3] = true;
                    break;
                }
            }
            for(;j<n;j++){
                if(c.charAt(j)=='k'){
                    visited[j] = true;
                    croak[4] = true;
                    break;
                }
            }
            if(containsFalse(croak)) return -1;
            i=j-1;
        }
        }
        if(containsFalse(visited)) return -1;
        return steps;
    }
    boolean containsFalse(boolean[] a){
        for(boolean b:a)
            if(!b) return true;
        return false;
    }
}