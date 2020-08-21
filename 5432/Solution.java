class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum=0;
        for(int i:salary){
            sum += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        sum-=max+min;
        // System.out.println(max+" "+min+"  "+sum);
        return (double)sum / ((double) salary.length-2);
    }
}