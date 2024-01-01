import java.util.*;

public class LinkedList {
    public static Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insertAtBeg(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void Display(){
        Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
    }
    public void InsertAtPos(int pos,int val){
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void Insert(int val){
        Node newNode=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void DeleteAtPos(int pos){
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void DeleteAtEnd(){
        Node temp=head,prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public static int getValueAtIndex(int ind){
        Node temp=head;
        for(int i=1;i<=ind;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public void Delete(int val){
        Node temp=head;
        Node prev=null;
        while(head!=null && head.data==val){
            head=head.next;
        }
        while(temp!=null && temp.next!=null){
            prev=temp;
            if(temp.next.data==val){
                prev.next=temp.next;
            }else{
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertAtBeg(10);
        list.insertAtBeg(0);
        list.Insert(10);
        list.Display();
        System.out.println();
        list.InsertAtPos(1,10);
        list.Display();
        System.out.println("The Value At the Index (2) = "+getValueAtIndex(2));
        // list.DeleteAtPos(0);
        // System.out.println();
        // list.Display();
        // list.DeleteAtPos(1);
        // System.out.println();
        // list.Display();
        // list.DeleteAtEnd();
        // System.out.println();
        // list.Display();
        list.Delete(10);
        // System.out.println();
        list.Display();
    }
}
