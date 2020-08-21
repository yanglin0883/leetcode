class Solution {
	
		
	private boolean[] vis = new boolean[10];
	
	private boolean[] forbid = new boolean[1000];
	private int[] valueMap1 = new int[1000] , valueMap2 = new int[1000];
	
    public boolean isSolvable(String[] words, String result) {
    	for (String word : words) {
    		if (word.length() > 1) {
    			forbid[word.charAt(0)] = true;    		
    		}
    	}
    	if (result.length() > 1) {
    		forbid[result.charAt(0)] = true;    		
    	}    	
    	
    	for (String word : words) {
    		int value = 1;    		
    		for (int i = word.length() - 1;i >= 0;i --) {
    			char ch = word.charAt(i);
    			valueMap1[ch] += value;    			    			
    			value *= 10;    			
    		}
    	}
    	int value = 1;
    	for (int i = result.length() - 1;i >= 0;i --) {
    		char ch = result.charAt(i);
    		valueMap2[ch] += value;    		
    		value *= 10;
    	}    	
    	Set<Character> set = new HashSet<>();    	
    	for (String word : words) {
    		for (char ch : word.toCharArray()) {
    			set.add(ch);    		
    		}    		
    	}
    	for (char ch : result.toCharArray()) {
    		set.add(ch);
    	}
    	List<Character> list = new ArrayList<>(set);
    	return backtracking(list , 0 , words , result , 0 , 0);
    }
    
    private boolean backtracking(List<Character> list , int current , String[] words , String result , int sum1 , int sum2) {
    	if (current == list.size()) {
    		return sum1 == sum2;    		
    	} else {
    		for (int i = 0;i < 10;i ++) {
    			if (!vis[i]) {
    				if (i == 0 && forbid[list.get(current)]) {
    					continue;    					
    				}    				
    				vis[i] = true;
    				int s1 = sum1 + valueMap1[list.get(current)] * i;
    				int s2 = sum2 + valueMap2[list.get(current)] * i;
    				if (backtracking(list , current + 1 , words , result , s1 , s2)) {
    					return true;
    				}
    				vis[i] = false;
    			}
    		}    		
    		return false;
    	}    	
    }
    
}