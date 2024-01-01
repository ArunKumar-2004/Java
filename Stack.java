public class Stack {
    Node top;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Stack(){
        top=null;
    }
    public void push(int val){
        Node newNode=new Node(val);
        if(top==null){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Empty");
        }
        else{
            System.out.println("Pop = "+top.data);
            top=top.next;
        }
    }
    public void peak(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(1000);
        st.peak();
        st.pop();
        st.pop();
        st.pop();
    }
}
