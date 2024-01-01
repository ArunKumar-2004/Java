import java.util.LinkedList;
import java.util.Queue;
public class Maximum {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    public static int Max(Node root){
        if(root==null){
            return -1;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        int level_no=0;
        int level=0;
        while(true){
            int NodeCount=q.size();
            if(NodeCount==0){
                break;
            }
            if(NodeCount>max){
                max=NodeCount;
                level_no=level;
            }
            while(NodeCount>0){
                Node n=q.poll();
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                NodeCount--;
            }
            level++;
        }
        return level_no;
    }
    public static void main(String[] args){
        Node root=new Node(2);
        root.left=new Node(1);
        root.right=new Node(3);
        root.left.left=new Node(5);
        root.left.right=new Node(7);
        root.right.right=new Node(10);
        root.left.right.left=new Node(12);
        System.out.print(Max(root));
    }
}
