class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0) return res;
        int limit = (Math.min(matrix.length , matrix[0].length)+1)/2;
        for(int size=0;size<limit;size++){
            // System.out.println(size);
            for(int i=size;i<matrix[0].length-size;i++)
                res.add(matrix[size][i]);
            for(int i=size+1;i<matrix.length-size;i++)
                res.add(matrix[i][matrix[0].length-1-size]);
            // System.out.println(res);
            if(res.size()>=matrix.length*matrix[0].length) break;
            for(int i=matrix[0].length-2-size;i>=size;i--)
                res.add(matrix[matrix.length-1-size][i]);
            // System.out.println(res);
            for(int i=matrix.length-2-size;i>size;i--)
                res.add(matrix[i][size]);
            // System.out.println(res);
        }
        return res;
    }
}