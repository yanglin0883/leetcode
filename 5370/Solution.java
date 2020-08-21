class UndergroundSystem {

    public UndergroundSystem() {
        
    }
    Map<Integer, String[]> record = new HashMap();
    Map<String, List<Integer>> aveTime = new HashMap();
    
    public void checkIn(int id, String stationName, int t) {
        String[] temp = {stationName, new Integer(t).toString()};
        record.put(id, temp);
        // System.out.println("checkIn: ");
    }
    
    public void checkOut(int id, String stationName, int t) {
        String[] str =record.get(id);
        // System.out.println("checkOut0: "+str[0]+" "+str[1]);
        String inf = getString(str[0], stationName);
        // System.out.println("checkOut:1 ");
        int time;
        time = t-new Integer(str[1]);
        // System.out.println("checkOut:2 ");
        if(aveTime.containsKey(inf)){
            aveTime.get(inf).add(time);
        }
        else {
            List<Integer> node = new ArrayList();
            node.add(time);
            aveTime.put(inf, node);
        }
        
        // System.out.println("checkOut: ");
    }
    private String getString(String start, String end){
        // System.out.println("getString: ");
        StringBuilder temp = new StringBuilder(start);
        temp.append("-");
        temp.append(end);
        
        return temp.toString();
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String inf = getString(startStation, endStation);
        int time=0, num=0;
        for(int i: aveTime.get(inf)){
            time+=i;
            num++;
        }        
        // System.out.println("AveTime: ");
        return (double)time / (double)num;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */