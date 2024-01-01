import java.util.*;
public class MinSwapsDesc {
    public static int Crack(int arr[],int i,int val,int count){
        while(true){
            count++;
            if(arr[i+1]==val){
                arr[i+1]=0;
                break;
            }else{
                int t=arr[i+1];
                arr[i+1]=0;
                i=t;
            }
        }
        return count-1;
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=n-1;i>=0;i--){
		    arr[i]=s.nextInt();
		}
		int Swaps=0;
		int k=0;
		for(int i=n-1;i>=0;i--){
		    if(arr[k]!=(i+1)){
		        Swaps+=Crack(arr,arr[k],(i+1),1);
		        arr[i]=0;
		    }else{
		        arr[i]=0;
		    }
		}
		System.out.println(Swaps);
	}
}