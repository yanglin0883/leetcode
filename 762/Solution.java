class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        Set<Integer> prime = new HashSet<>();
        prime.add(2);prime.add(3);prime.add(5);prime.add(7);prime.add(11);prime.add(13);
        prime.add(17);prime.add(19);prime.add(23);prime.add(29);prime.add(31);
        for(int i=L;i<=R;i++){
            if(prime.contains(Integer.bitCount(i))) count++;
        }
        return count;
    }
}