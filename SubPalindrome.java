import java.util.*;
public class SubPalindrome {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		int win=2,count=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<=n-win;j++){
		        String st=str.substring(j,j+win);
		        if(isPalindrome(st)){
		            count++;
		        }
		    }
		    win++;
		}
		System.out.print(count);
	}
}