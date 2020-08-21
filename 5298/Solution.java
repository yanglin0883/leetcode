class Solution {
    public boolean isSolvable(String[] words, String result) {
        Set<Character> hm = new HashSet<>();
        for(String t:words){
            for(int i=0;i<t.length();i++)
                hm.add(t.charAt(i));
        }
        for(int i=0;i<result.length();i++){            
                hm.add(result.charAt(i));
        }
        //System.out.println(hm);
        if(hm.size()>10) return false;
        char[] ch = new char[hm.size()];
        int j=0;
        for(Character i:hm){
            ch[j++] = i;
        }
        wo = words; res = result;
        dfs(ch, new ArrayList<Integer>());
        return flag;
    }
    boolean flag=false;
    String[]wo;
    String res;
    void dfs(char[] origin, ArrayList<Integer>temp){
        if(flag) return;
        if(temp.size()==origin.length){
            flag = check(origin, temp);
            //System.out.println("this is :"+temp);
            return;
        }
        //System.out.println(temp);
        for(int i=0;i<10;i++){
            if(temp.contains(i))
                continue;
            temp.add(i);
            dfs(origin, temp);
            temp.remove(temp.size()-1);
        }
    }
    boolean check(char[] ori,ArrayList<Integer>list){
        HashMap<Character, Integer>hm = new HashMap<>();
        for(int i=0;i<list.size();i++)
            hm.put(ori[i], list.get(i));
        if(hm.get(res.charAt(0))==0) return false;
        for(int i=0;i<wo.length;i++)
            if(hm.get(wo[i].charAt(0))==0) return false;            
        int[] add = new int[wo.length];
        int right =toNum(res, hm);
        for(int i=0;i<add.length;i++)
            add[i] = toNum(wo[i], hm);
        int sum = 0;
        for(int i:add) sum+=i;
        return sum==right;
    }
    int toNum(String s, HashMap<Character, Integer>hm){
        int num=0;
        for(int i=0;i<s.length();i++){
            num*=10;
            num+=hm.get(s.charAt(i));
        }
        //System.out.println(num);
        return num;
    }
}