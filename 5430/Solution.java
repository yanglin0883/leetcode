class BrowserHistory {

    public BrowserHistory(String homepage) {
        pages = new ArrayList();
        pages.add(homepage);
    }
    ArrayList<String> pages ;
    int cur = 0;
    
    public void visit(String url) {
        pages.add(++cur, url);
        for(int i=cur+1;i<pages.size();)
            pages.remove(i);
    }
    
    public String back(int steps) {
        cur-=steps;
        if(cur<0)cur=0;
        return pages.get(cur);
    }
    
    public String forward(int steps) {
        cur += steps;
        if(cur>=pages.size()) cur = pages.size()-1;
        return pages.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */