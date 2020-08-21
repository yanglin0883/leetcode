class Solution {
    private class Ch{
        int num;
        char letter;
        Ch(int a, char b){
            num=a;
            letter=b;
        }
    }
    public boolean isLongPressedName(String name, String typed) {
        if(name==null||typed==null) return false;
        if(typed.length()<name.length())return false;
        List<Ch> str = new ArrayList<Ch>();
        for(int i=0;i<name.length();){
            int j=i;
            while(j<name.length()&&name.charAt(j)==name.charAt(i))j++;
            str.add(new Ch(j-i, name.charAt(i)));
            i=j;
        }
        int k=0;
        for(int i=0;i<typed.length();){
            int j=i;
            while(j<typed.length()&&typed.charAt(j)==typed.charAt(i))j++;
            //System.out.println(k+" "+str.size());
            if(k>=str.size()) return false;
            if(str.get(k).letter!=typed.charAt(i)||str.get(k).num>j-i)
                return false;
            k++;
            i=j;
        }
        if(k!=str.size()) return false;
        return true;
    }
}