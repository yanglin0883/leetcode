class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int indegree[] = new int[n];
        int[] outdegree = new int[n];
        for(int i=0;i<n;i++){
            if(leftChild[i]!=-1) {
                outdegree[i]++;
                indegree[leftChild[i]]++;
            }
            if(rightChild[i]!=-1) {
                outdegree[i]++;
                indegree[rightChild[i]]++;
            }
        }
        Queue<Integer>bfs = new LinkedList();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) bfs.offer(i);
            if(indegree[i]>1) return false;
            if(outdegree[i]>2) return false;
        }
        if(bfs.size()!=1) return false;
        while(!bfs.isEmpty()){
            int temp = bfs.poll();
            
            if(leftChild[temp]!=-1&&--indegree[leftChild[temp]]==0) bfs.offer(leftChild[temp]);
            if(rightChild[temp]!=-1&&--indegree[rightChild[temp]]==0) bfs.offer(rightChild[temp]);
        }
        for(int i=0;i<n;i++){
            if(indegree[i]!=0) return false;
        }
        return true;
    }
}