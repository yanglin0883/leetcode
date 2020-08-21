class Solution {
    public boolean isSolvable(String[] words, String result) {
        Set<Character> s = new HashSet<>();
        for(String t:words){
            for(int i=0;i<t.length();i++)
                s.add(t.charAt(i));
        }
        for(int i=0;i<result.length();i++){            
                s.add(result.charAt(i));
        }
        //System.out.println(hm);
        //if(s.size()>10) return false;
        ch = new char[s.size()];
        canBeZero = new boolean[ch.length];
        Arrays.fill(canBeZero, true);
        int j=0;
        T:for(Character i:s){
            ch[j] = i;
            if(i==result.charAt(0)) canBeZero[j] = false;
            else for(int k=0;k<words.length;k++){
                if(words[k].charAt(0)==i){
                    canBeZero[j++] = false;
                    continue T;
                }
            }
            j++;
        }
        wo = new char[words.length+1][];
        wo[0] = result.toCharArray();
        for(int i=0;i<words.length;i++)
            wo[i+1] = words[i].toCharArray();
        dfs( new ArrayList<Integer>());
        return flag;
    }
    char[] ch;
    boolean[] canBeZero;
    boolean flag=false;
    char[][]wo;
    void dfs(  List<Integer>temp){
        if(flag) return;
        if(temp.size()==ch.length){
            flag = check( temp);
            //System.out.println("this is :"+temp);
            return;
        }
        //System.out.println(temp);
        for(int i=(canBeZero[temp.size()])?0:1;i<10;i++){
            if(temp.contains(i)) continue;
            temp.add(i);
            dfs( temp);
            temp.remove(temp.size()-1);
        }
    }HashMap<Character, Integer>hm;
    boolean check(List<Integer>list){
         hm= new HashMap<>();
        for(int i=0;i<ch.length;i++)
            hm.put(ch[i], list.get(i));
        int right =toNum(0, hm);
        for(int i=1;i<wo.length;i++)
            right-= toNum(i, hm);        
        return 0==right;
    }
    int toNum(int j, HashMap<Character, Integer>hm){
        int num=0;
        for(int i=0;i<wo[j].length;i++){
            num*=10;
            num+=hm.get(wo[j][i]);
        }
        //System.out.println(num);
        return num;
    }
}