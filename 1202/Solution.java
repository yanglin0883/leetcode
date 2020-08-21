class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if(s==null||s.length()<2||pairs==null||pairs.size()==0) return s;
        str = s.toCharArray();
        List<Set<Integer>> groups = new ArrayList();
        Set<Integer> visited = new HashSet<>();
        out:for(List<Integer> i: pairs){
            if(i.get(0)==i.get(1))continue;
            if(!visited.contains(i.get(0))&&!visited.contains(i.get(1))){                
                Set<Integer> temp = new HashSet<>();
                temp.add(i.get(0));
                temp.add(i.get(1));
                visited.add(i.get(0));
                visited.add(i.get(1));
                groups.add(temp);
            }
            else if(visited.contains(i.get(0))&&visited.contains(i.get(1))){
                int index1=-1, index2=-1;
                for(int j=0;j<groups.size();j++){
                    if(index1==-1 && groups.get(j).contains(i.get(0))) index1 = j;
                    if(index2==-1 && groups.get(j).contains(i.get(1))) index2 = j;
                }
                if(index1==index2) continue;
                groups.get(index1).addAll(groups.get(index2));
                groups.remove(index2);
            }
            else
            for(Set<Integer> j : groups){
                if(j.contains(i.get(0)) || j.contains(i.get(1))){
                    j.add(i.get(0));
                    j.add(i.get(1));
                    visited.add(i.get(0));
                    visited.add(i.get(1));                    
                }                
            }
            // System.out.println(i);
            // System.out.println("visited: "+visited);
            // for(Set<Integer> j : groups){
            //     System.out.println("groups: "+j);
            // }
        }
        for(Set<Integer> i : groups){
            sortChar(i);
        }
        return new String(str);
    }
    char[] str;
    void sortChar(Set<Integer> group){
        List<Integer> index = new ArrayList(group);
        Collections.sort(index);
        // System.out.println("sort: "+index);
        for(int i=0;i<index.size();i++){
            int min=i;
            for(int j=i+1;j<index.size();j++){
                if(str[index.get(j)]<str[index.get(min)]) min = j;
            }
            if(min!=i){
                char temp = str[index.get(i)];
                str[index.get(i)] = str[index.get(min)];
                str[index.get(min)] = temp;
            }
        }
    }
}