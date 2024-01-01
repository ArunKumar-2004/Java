import java.util.Scanner;

public class MatrixZigZag {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        int row=0,col=0,dir=1;
        for(int i=1;i<=r+c+1;i++){
            if(dir==1){
                while(row>=0 && col<c){
                    System.out.print(mat[row][col]+" ");
                    row--;col++;
                }
                dir=-1;
                if(row<0 && col<c){
                    row=0;
                }
                if(col>=c){
                    col=c-1;
                    row+=2;
                }
            }else{
                while(row<r && col>=0){
                    System.out.print(mat[row][col]+" ");
                    row++;
                    col--;
                }
                dir=1;
                if(col<0 && row<r){
                    col=0;
                }
                if(row>=r){
                    row=r-1;
                    col+=2;
                }
            }
        }
    }
}
