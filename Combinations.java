import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int l=str.length();
        List<String> arr=new ArrayList<>();
        int ind=0;
        for(int i=1;i<=(1<<l)-1;i++){
            String st="";
            for(int j=l-1;j>=0;j--){
                if((i&(1<<j))!=0){
                    st+=str.charAt(l-1-j);
                }
            }
            arr.add(st);
        }
        Collections.sort(arr);
        System.out.println((arr));
    }
}
