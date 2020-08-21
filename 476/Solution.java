class Solution {
    public int findComplement(int num) {
        int c=1;
        while(num>c){
            c<<=1;
            c|=1;
        }
        return num ^c;
    }
}