import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        arr[1]=1;
        for(int i=2;i<=n;i++){
            int onePart=1;
            int remain=i-onePart;
            while(remain!=0){
                int max=Math.max(arr[remain],remain);
                if((onePart*max)>arr[i]){
                    arr[i]=onePart*max;
                }
                onePart++;
                remain--;
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
    }
}
