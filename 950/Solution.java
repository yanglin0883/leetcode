class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length<2) return deck;
        int[] order = new int[deck.length];
        int index=0, label=1;
        do{
            order[index] = label++;
            index = next(index, order);
            // System.out.println("  : "+index);
        }while(index!=-1);
        // order[index] = label;
        int[]res =  new int[order.length];
        Arrays.sort(deck);
        for(int i=0;i<deck.length;i++){
            res[i] = deck[order[i]-1];
        }
        return res;
    }
    int next(int index, int[]order){
        if(!containsZero(order)) return -1;
        boolean flag = false;
        // System.out.println("next: ");
        for(int i=index+1;true;i++){
            int temp = i<order.length?i:i%order.length;
            if(order[temp]==0) {
            // System.out.print("  "+temp);
                if(flag)return temp;
                flag = !flag;
            }
        }
        // return -1;
    }
    boolean containsZero(int[]a){
        // for(int i=0;i<a.length;i++)
        //     System.out.print(a[i]+"  ");
        // System.out.println();
        for(int i=0;i<a.length;i++)
            if(a[i]==0) return true;
        return false;
    }
}