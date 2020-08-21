class Solution {
    public double probabilityOfHeads(double[] prob, int target) {        
        return help(prob, 0, target);
    }
    double help(double[] prob, int index, int target){
        // at "index" we need "target" heads
        if(target>prob.length-index)return 0;
        if(target==prob.length-index){
            // all head
            double counter=1.0;
            for(int i=index;i<prob.length;i++)
                counter*=prob[i];
            return counter;
        }
        if(target==0){
            // all tail
            double counter=1.0;
            for(int i=index;i<prob.length;i++)
                counter*=(1-prob[i]);
            return counter;
        }
        if(index==prob.length) return 0;
        return prob[index]*help(prob, index+1, target-1) + (1-prob[index])*help(prob, index+1, target);
    }
}