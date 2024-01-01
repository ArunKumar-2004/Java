import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static void printMax(int arr[],int n,int k){
        Deque<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for(int i=k;i<n;i++){
            System.out.print(arr[q.peek()]+" ");
            while(!q.isEmpty() && q.peek()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        System.out.print(arr[q.peek()]);
    }
    public static void main(String[] args){
        int arr[]={8,10,7,4,21,15,7,8,90,0};
        int k=4;
        printMax(arr,arr.length,k);
    }
}
