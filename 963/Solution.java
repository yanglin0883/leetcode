class Solution {
    public double minAreaFreeRect(int[][] points) {
        HashMap<Dia, ArrayList<int[]>> hm = new HashMap<>();
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                Dia temp = new Dia(points[i], points[j]);
                if(!hm.containsKey(temp)){
                    hm.put(temp, new ArrayList<int[]>());
                }
                int[] end ={points[i][0], points[i][1], points[j][0], points[j][1]};
                hm.get(temp).add(end);
            }
        }
        double min = 0;
        for(Dia i : hm.keySet()){
            if(hm.get(i).size()>1){
                int size = hm.get(i).size();
                for(int j=0;j<size;j++)
                    for(int k=j+1;k<size;k++){
                        double a = area(hm.get(i).get(j), hm.get(i).get(k));
                        //System.out.println(a+" "+j+" "+k);
                        if(min==0) min = a;
                        else min = Math.min(min, a);
                    }
            }
        }
        return min;
    }
    
    double area(int[]a, int[]b){
        return Math.sqrt((b[1]-a[1])*(b[1]-a[1])+(b[0]-a[0])*(b[0]-a[0]))
                *Math.sqrt((b[1]-a[3])*(b[1]-a[3])+(b[0]-a[2])*(b[0]-a[2]));
    }
    
    class Dia{
        int midPoint[]=new int[2], dis; 
        // midPoint coordinate is 2 times , dis is square of distance
        
        Dia(int[] a, int[] b){
            midPoint[0] = a[0]+b[0];
            midPoint[1] = a[1]+b[1];
            dis = (b[0]-a[0])*(b[0]-a[0]) + (b[1]-a[1])*(b[1]-a[1]);
        }
        @Override
        public int hashCode(){
            return dis+midPoint[0]*31+midPoint[1]*31*31;
        }
        @Override
        public boolean equals(Object obj){
            if(obj.getClass()!=this.getClass()) return false;
            Dia temp = (Dia) obj;
            return  temp.dis==this.dis 
                    &&temp.midPoint[0]==this.midPoint[0]
                    &&temp.midPoint[1]==this.midPoint[1];
        }
    }
}