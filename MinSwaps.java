import java.util.*;
public class MinSwaps {
    public static int Crack(int[] arr,int pos,int val,int count){
        while(true){
            count++;
            if(arr[pos-1]==val){
                arr[pos-1]=0;
                break;
            }else{
                int temp=arr[pos-1];
                arr[pos-1]=0;
                pos=temp;
            }
        }
        System.out.println("Count="+count);
        return count-1;
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int Swaps=0;
		for(int i=0;i<n;i++){
		    if(arr[i]!=(i+1) && arr[i]!=0){
		        Swaps+=Crack(arr,arr[i],(i+1),1);
		        arr[i]=0;
		    }
		    else{
		        arr[i]=0;
		    }
		}
        System.out.println(Swaps);
	}
}