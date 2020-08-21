/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        res.append('[');
        if(root!=null){
            Queue<TreeNode> bfs = new LinkedList<>();
            bfs.offer(root);
            while(!bfs.isEmpty()){
                TreeNode node = bfs.poll();
                if(node==null)res.append("null");
                else {
                    res.append(node.val);
                    bfs.offer(node.left);
                    bfs.offer(node.right);
                }
                res.append(',');
            }
            res.deleteCharAt(res.length()-1);
        }
        res.append(']');
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null||data.length()<3) return null;
        String[] nodes = data.substring(1, data.length()-1).split(",");
        if(nodes[0].equals("null")) return null;
        TreeNode root = new TreeNode(new Integer(nodes[0]).intValue());
        Queue<TreeNode> bfs = new LinkedList();
        bfs.offer(root);
        boolean beLeft = true;
        for(int i=1;i<nodes.length;i++){
            if(!nodes[i].equals("null")){
                TreeNode node = new TreeNode(new Integer(nodes[i]).intValue());
                TreeNode top = bfs.peek();
                if(beLeft) top.left = node;
                else top.right = node;
                bfs.offer(node);
            }else{
                
            }
            beLeft = !beLeft;
            if(beLeft) bfs.poll();
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));