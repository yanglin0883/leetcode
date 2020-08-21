class TweetCounts {

    public TweetCounts() {
        data = new HashMap();
    }
    HashMap<String, TreeSet<Long>> data;
    int gen=0;
    public void recordTweet(String tweetName, int time) {
        if(!data.containsKey(tweetName)){
            data.put(tweetName, new TreeSet());
        }
        data.get(tweetName).add((long)time<<32|gen++);
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        
        int interval = 0;
        switch(freq){
            case "minute": interval = 60;break;
            case "hour": interval = 3600;break;
            case "day": interval = 3600*24;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<=(endTime-startTime)/interval;i++) res.add(0);
        if(data.containsKey(tweetName)){
            for(long h : data.get(tweetName).subSet((long)startTime<<32, (long)endTime+1<<32)){
                h>>>=32;
                int ind = (int)((h-startTime)/interval);
                res.set(ind, res.get(ind)+1);
            }
        }
        return res;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */