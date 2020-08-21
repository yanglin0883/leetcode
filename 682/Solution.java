class Solution {
    public int calPoints(String[] ops) {
        if(ops==null||ops.length==0) return 0;
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for(String i: ops){
            //System.out.println(i);
            switch(i){
                case "+":
                    if(scores.size()<2) throw new RuntimeException("invalid input");
                    scores.add(scores.get(scores.size()-1)+scores.get(scores.size()-2));
                    break;
                case "D":
                    if(scores.size()<1) throw new RuntimeException("invalid input");
                    scores.add(scores.get(scores.size()-1)*2);
                    break;
                case "C":
                    if(scores.size()<1) throw new RuntimeException("invalid input");
                    scores.remove(scores.size()-1);
                    break;
                default:
                    Integer temp = getInteger(i);
                    if(temp==null) throw new RuntimeException("invalid input");
                    else scores.add(temp);
            }
        }
        int sum=0;
        for(Integer i: scores){
            sum = sum + i;
        }
        return sum;
    }
    
    private Integer getInteger(String s){
        int res=0;
        boolean negative = false;
        for(char c: s.toCharArray()){
            if(c=='-') {
                negative=true;
                continue;
            }
            if(c<'0'||c>'9') return null;
            res*=10;
            res += (int)(c-'0');
        }
        if(negative) res = -res;
        return new Integer(res);
    }
}