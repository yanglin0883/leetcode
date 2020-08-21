class Solution {
    public int minSetSize(int[] arr) {
        if(arr==null||arr.length==0) return 0;
        int target = (arr.length+1)/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        // System.out.println(hm.keySet());
        ArrayList<Map.Entry<Integer, Integer>> temp = new ArrayList<>(hm.entrySet());
        Collections.sort(temp, (p1, p2)->p2.getValue()-p1.getValue());
        // System.out.println(temp);
        int sum=0;
        for(int i=0;i<temp.size();i++){
            sum = sum + temp.get(i).getValue();
            // System.out.println(target+"  :  "+sum);
            if(sum>=target) return i+1;
        }
        return temp.size();
    }
}