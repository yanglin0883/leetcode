class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] str = S.toCharArray();
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            int j =i+1;
            while(j<str.length && str[j] == str[i])j++;
            //System.out.println(i+"   "+j);
            if(j-i>=3){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i); temp.add(j-1);
                //System.out.println(temp);
                res.add(temp);
            }
            i = j-1;
        }
        return res;
    }
}