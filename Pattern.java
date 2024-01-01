import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int len = str.length();
        int mid = len / 2;
        String first = str.substring(0, mid);
        String last = str.substring(mid );
		String midlast=str.substring(mid,len-1);
		StringBuilder sb=new StringBuilder(midlast);
		sb.reverse();
        int k = mid, p = mid;

        for (int i = 0; i <mid + 1; i++) {
            for (int j = 0; j < str.length(); j++) {
				if(i<mid){
                if ((k == j || p == j) ) {
                    System.out.print(first.charAt(i));
                } else {
                    System.out.print("*");
                }
            }
		}
            k--;
            p++;
            
            if (i == mid) {
                System.out.print(last+new String(sb));
            }
			System.out.println();
        }
    }
}
