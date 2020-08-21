class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList();
        Set<String> temp = new TreeSet();
        Set<Integer> table = new TreeSet();
        for(List<String>i:orders){
            temp.add(i.get(2));
            table.add(new Integer(i.get(1)));
        }
        List<String> col = new ArrayList(temp);
        col.add(0, "Table");
        Map<String, Integer> mapr = new HashMap();
        Map<String, Integer> mapc = new HashMap();
        int rows=0;
        res.add(col);
        for(Integer j:table){
            String i = j.toString();
            mapr.put(i, rows++);
            ArrayList<String> al = new ArrayList();
            al.add(i);
            res.add(al);
        }
        int cols=-1;
        for(String i : col){
            mapc.put(i, cols++);
        }
        int[][] te = new int[rows][cols];
        for(List<String>i:orders){            
            te[mapr.get(i.get(1))][mapc.get(i.get(2))]++;
        }
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++){
                res.get(i+1).add(Integer.toString(te[i][j]));
            }
        return res;
    }
}