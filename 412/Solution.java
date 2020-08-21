class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            StringBuilder temp = new StringBuilder();
            if(i%3==0) temp.append("Fizz");
            if(i%5==0) temp.append("Buzz");
            if(temp.length()==0) temp.append(i);
            res.add(temp.toString());
        }
        return res;
    }
}