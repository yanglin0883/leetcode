class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0, ten=0;
        for(int i=0;i<bills.length;i++){
            switch(bills[i]){
                case 5: five++; break;
                case 10: five--;ten++;break;
                case 20: five--;if(ten>0)ten--; else five-=2;
            }
            //System.out.println(ten+"  "+five);
            if(five<0||ten<0) return false;
        }
        return true;
    }
}