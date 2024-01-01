import java.util.Scanner;

public class Toll {
    public static int getMax(int kms,int gap,int tolls,int tollDist[],int fares[]){
        int rev[]=new int[kms];
        rev[0]=0;
        int tollInd=0;
        for(int i=1;i<=kms;i++){
            if(tollDist[tollInd]==i){
                if(i<=gap){
                    rev[i]=Math.max(rev[i-1],fares[tollInd]);
                }else{
                    rev[i]=Math.max(rev[i-1],fares[tollInd]+rev[i-gap-1]);
                }
                tollInd++;
                if(tollInd==tolls){
                    return rev[i];
                }
            }else{
                rev[i]=rev[i-1];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int k=s.nextInt();
        int dist[]=new int[k];
        int amm[]=new int[k];
        for(int i=0;i<k;i++){
            dist[i]=s.nextInt();
        }
        for(int i=0;i<k;i++){
            amm[i]=s.nextInt();
        }
        System.out.println(getMax(n, d, k, dist, amm));
    }
}
