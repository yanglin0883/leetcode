class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        char[] str = s.toCharArray();
        int N = str.length - minSize;
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0;i<=N;i++){
            for(int j=minSize-1;j<maxSize;j++){
                if(judge(maxLetters, str, i, i+j)) {
                    String temp= s.substring(i, i+j+1);
                    //System.out.println(temp);
                    hm.put(temp, hm.getOrDefault(temp, 0)+1);
                }
            }
        }
        int max =0;
        for(String i : hm.keySet()){
            int temp =hm.get(i);
            if(temp>max) max = temp;
        }
        return max;
    }
    boolean judge(int max, char[] str, int start, int end){
        if(end>=str.length) return false;
        int temp=0;
        for(int i=start;i<=end;i++){
            temp |= 1<<str[i];
        }
        if(Integer.bitCount(temp)>max) return false;
        return true;
    }
}