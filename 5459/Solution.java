class Solution {
    public int minNumberOperations(int[] target) {
        int[]t = lessD(target);
        if(t.length==1) return t[0];
        List<Integer>p=new ArrayList();
        List<Integer>v=new ArrayList();
        if(t[0]>t[1])p.add(0);
        for(int i=1;i<t.length-1;i++){
            if(t[i]>t[i-1] && t[i]>t[i+1]) p.add(i);
            if(t[i]<t[i-1] && t[i]<t[i+1]) v.add(i);
        }
        if(t[t.length-1]>t[t.length-2]) p.add(t.length-1);
        return helper(0,t,  p,0, p.size()-1, v, 0, v.size()-1);
    }
    int[] lessD(int[] t){
        int i=0, j=0;
        for(j=0;j<t.length;j++){
            if(j==0 || t[j]!=t[j-1] )t[i++] = t[j];
        }
        return Arrays.copyOfRange(t, 0, i);
    }
    
    int helper(int base, int[]t,  List<Integer>p, int pl, int pr, List<Integer>v, int vl, int vr){
        if(vl>vr){
            return t[p.get(pl)]-base;
        }
        int minV = vl;
        for(int i=vl;i<=vr;i++){
            if(t[v.get(i)]<t[v.get(minV)])
                minV = i;
        }
        int pm = pl;
        for(int i=pl; i<=pr;i++){
            if(p.get(i)>v.get(minV)){
                pm = i;
                break;
            }
        }
        // System.out.println(p+"  "+pl+" "+pr+"  "+pm+"  "+v+"  "+vl+"  "+vr+" "+minV);
        int res= t[v.get(minV)]-base + helper(t[v.get(minV)], t, p, pl, pm-1, v, vl, minV-1) + helper(t[v.get(minV)], t, p, pm, pr, v, minV+1, vr);
        // System.out.println(res);
        return res;
    }
}