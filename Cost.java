import java.util.Scanner;
public class Cost {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="hello";
        String st="hail";
        int mat[][]=new int[str.length()+1][st.length()+1];
        for(int i=0;i<=str.length();i++){
            for(int j=0;j<=st.length();j++){
                if(i==0){
                    mat[i][j]=j;
                }
                if(j==0){
                    mat[i][j]=i;
                }
                if(i>=1 && j>=1){
                    if(str.charAt(i-1)==st.charAt(j-1)){
                        mat[i][j]=mat[i-1][j-1];
                    }else{
                        int min=Math.min(Math.min(mat[i-1][j-1],mat[i-1][j]),mat[i][j-1])+1;
                        mat[i][j]=min;
                    }
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
