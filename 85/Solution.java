class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int row = matrix[0].length;
        int n = matrix.length;
        int rowArr[] = new int[row];
        int maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<row;j++){
                if(matrix[i][j]=='0')
                    rowArr[j]=0;
                else 
                    rowArr[j]+= matrix[i][j]-'0';
            }
            System.out.println(Arrays.toString(rowArr));
            maxArea = Math.max(maxArea, maxRectangleArea(rowArr));
        }
        return maxArea;
    }
    int maxRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        int max=0;
        for(int i=0;i<heights.length;++i){
            // System.out.println(stack);
            while(stack.peek()!=-1&&heights[stack.peek()] >= heights[i])
                max = Math.max(max, heights[stack.pop()]*(i-stack.peek()-1));
            // System.out.println(max);
            stack.push(i);
        }
            // System.out.println(stack);
        while(stack.peek()!=-1)
            max = Math.max(max, heights[stack.pop()]*(heights.length-stack.peek()-1));
            // System.out.println(max);
        return max;
    }
}