class Solution {
    class Nei{
        int val;
        List<Integer> next = new ArrayList();
        List<Double> prob = new ArrayList();
        Nei(int b){val = b;}
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<Nei> map = new ArrayList();
        for(int i=0;i<n;i++){
            Nei p = new Nei(i);
            map.add(p);
        }
        for(int i=0;i<succProb.length;i++){
            int a = edges[i][0], b = edges[i][1];
            map.get(a).next.add(b);
            map.get(a).prob.add(succProb[i]);
            map.get(b).next.add(a);
            map.get(b).prob.add(succProb[i]);
        }
        class Node{
            int cur;double p = 1.0;
            Node(int c, double e){
                cur=c;p=e;
            }
        }
        Queue<Node> q = new PriorityQueue<>((a,b)->{
            if(a.p-b.p<0) return 1;
            else return -1;
        });
        
        Node p  = new Node(start, 1.0);
        q.offer(p);
        while(!q.isEmpty()){
            p = q.poll();
            if(p.cur == end) return p.p;
            int st = p.cur;
            int len = map.get(st).next.size();
            for(int i=0;i<len;i++){
                int a = map.get(st).next.get(i);
                double b = map.get(st).prob.get(i);
                b *= p.p;
                Node temp = new Node(a,b);
                q.offer(temp);
            }
            map.get(st).next.clear();
        }
        return 0.0;
    }
}