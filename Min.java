import java.util.*;

public class Min {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==1){
            System.out.print("1");
            return;
        }
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int jumps = 1;
        int mri = arr[0];
        int steps = arr[0];
        
        for (int i = 1; i < n; i++) { 
            if(i==n-1)
                break;
            int val = i + arr[i];
            if (val > mri) {
                mri = val;
            }
            steps--;
            if (steps == 0) {
                jumps++;
                steps = mri - i;
                System.out.println("\nJumps=" + jumps + " Steps=" + steps);
            }
            
            
        }
        
        System.out.print(jumps);
    }
}
