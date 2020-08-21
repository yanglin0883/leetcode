class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<6) return false;
        List<Integer> div = new ArrayList<>();
        double temp = Math.sqrt(num);
        for(int i=2;i<temp;i++){
            if(num%i==0){
                div.add(i);
                div.add(num/i);
            }
        }
        div.add(1);
        if(temp*temp==num)div.add((int)temp);
        for(Integer i : div)
            num = num - i;
        return num ==0;
    }
}