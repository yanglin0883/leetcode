class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if(transactions.length==0) return new ArrayList<String>();
        //System.out.println(transactions.length);
        Infor[] trans = new Infor[transactions.length];
        for(int i=0;i<transactions.length;i++){
            //System.out.println(transactions[i]+" "+i);
            trans[i] = new Infor(transactions[i]);
        }
        Arrays.sort(trans, (p1, p2)-> {
            int temp = p1.name.compareTo(p2.name); 
            return (temp!=0)?temp:p1.time-p2.time;
            });
        // for(Infor i: trans){
        //     System.out.println(i);
        // }
        for(int i=0;i<trans.length;i++){
            if(premited(i, trans)) set.add(i);
        }
        for(Integer i: set)res.add(trans[i].toString());
        return res;
    }
    boolean premited(int i, Infor[]trans){
        if(trans[i].amount>1000)return true;
        for(int j=i-1;j>-1;j--){
            if(Math.abs(trans[j].time-trans[i].time)>60) break;
            if(samePersonCity(trans[i], trans[j])) return true;
        }
        for(int j=i+1;j<trans.length;j++){
            if(Math.abs(trans[j].time-trans[i].time)>60) break;
            if(samePersonCity(trans[i], trans[j])) return true;
        }
        return false;
    }
    boolean samePersonCity(Infor i1, Infor i2){
        return(i1.name.equals(i2.name)&&(!i1.city.equals(i2.city) ));
    }
    class Infor{
        int time=0, amount=0;
        String name, city, t;
        Infor(String in){
            String[] temp = in.split(",");
            name = temp[0];
            time = Integer.parseInt(temp[1]);
            amount = Integer.parseInt(temp[2]);
            city = temp[3];
            t = in;
        }
        public String toString(){
            return t;
        }
    }
}