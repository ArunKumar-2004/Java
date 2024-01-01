import java.util.*;

public class LongestPalindromeSplitsCount {
	public static int calculateSplits(String str,int start,int end,boolean arr[][],Integer splits[][]){
        if(arr[start][end]){
            return 0;
        }
        if(splits[start][end]!=null){
            return splits[start][end];
        }
        int minSplits=str.length();
        for(int i=start;i<end;i++){
            int curr= 1+calculateSplits(str,start,i,arr,splits)+calculateSplits(str,i+1,end,arr,splits);
            if(curr<minSplits){
                minSplits=curr;
            }
        }
        splits[start][end]=minSplits;
        return minSplits;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = str.length();
		boolean arr[][] = new boolean[n + 1][n + 1];
		for (int i = 0; i < n; i++) {
			arr[i][i] = true;
		}
		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				arr[i][i + 1] = true;
			}
		}
		for (int i = 3; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (str.charAt(j) == str.charAt(j + i - 1) && arr[j + 1][j + i - 2] ) {
					arr[j][j + i - 1] = true;
				}
			}
		}
		Integer splits[][] = new Integer[n][n];
		System.out.println(calculateSplits(str, 0, n - 1, arr, splits));
	}
}