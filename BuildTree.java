import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class BuildTree {
    static HashMap<Integer, Integer> Map = new HashMap();
    static int PreIndex = 0;
    public static TreeNode BuildTreeMap(int[] Pre, int[] In) {
        for (int i = 0 ; i < In.length; i++){
            Map.put(In[i], i);
        }
        return CreateTree(Pre, 0, In.length - 1);
    }

    public static TreeNode CreateTree(int[] Pre, int InLeft, int InRight) {
        if (InLeft > InRight){
            return null;
        }
        TreeNode root = new TreeNode(Pre[PreIndex++]);
        int InMid= Map.get(root.val);
        root.left =  CreateTree(Pre, InLeft, InMid- 1);
        root.right = CreateTree(Pre, InMid+ 1, InRight);
        return root;
    }
    public static void printTree(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            for(int i=0;i<queue.size();i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    System.out.print(node.val+" ");
                    queue.offer(node.left);
                    queue.offer(node.right);
                }else{
                    System.out.print("null ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int Pre[]={10,20,40,50,30,60};
        int In[]={40,20,50,10,60,30};
        TreeNode result=BuildTreeMap(Pre,In);
        printTree(result);
    }
}


