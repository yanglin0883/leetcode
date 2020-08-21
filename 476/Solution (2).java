class Solution {
    public int findComplement(int num) {
        String temp = Integer.toBinaryString(num);
        System.out.println(temp);
        int res=0;
        for(int i=0;i<temp.length();i++){
            res<<=1;
            if(temp.charAt(i)=='0') res++;
            System.out.println(res+" :: "+ temp.charAt(i)+" i= "+i);
        }
        return res;
    }
}