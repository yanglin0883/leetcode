class Solution {
    public String toHexspeak(String num) {
        ArrayList<Integer> a = new ArrayList();
        for(char c: num.toCharArray()){
            a.add(c-'0');
        }
        StringBuilder sb = new StringBuilder();
        while(a.size()>0){
            ArrayList<Integer> temp = new ArrayList();
            while(a.size()>0){
            if(a.size()==1){sb.append(digit[a.get(0)]); break;}
            else if(a.size()==2 && a.get(0)=='1'&&a.get(1)<'6'){
                sb.append(digit[a.get(0)*10+a.get(1)]);
                break;
            }
                int res = 0;
                if(a.get(0)=='0'){
                    a.remove(0);
                    continue;                
                }else if(a.get(0)=='1' && a.get(1)<'6'){
                    int r = a.get(0)*100+a.get(1)*10+a.get(2);
                    a.set(2, r%16);
                    a.remove(0);
                    a.remove(1);
                    res = r/16;
                } else{
                    int r = a.get(0)*10+a.get(1);
                    a.set(1, r%16);
                    a.remove(0);
                    res = r/16;
                }
                temp.add(res);
            }
            a = temp;
        }
        sb.reverse();
        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        // System.out.println(sb.toString());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1') sb.setCharAt(i, 'I');
            if(sb.charAt(i)=='0') sb.setCharAt(i, 'O');
            if(!Character.isLetter(sb.charAt(i))) return "ERROR";}
        return sb.toString();
    }
    char[]digit={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

}