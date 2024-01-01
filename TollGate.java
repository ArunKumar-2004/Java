import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TollGate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tot = 100;
        int k = 30 + 1;
        int n = 4;
        int dist[] = {10,20,40,80};
        int amm[] = {30,20,10,30};
        
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(dist[0], 0);

        int max = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i - 1] >= k) {
                int f1 = 0, f2 = 0, prev = 0, temp = 0;
                int di = dist[i - 1] - k;
                if(di<0){
                    max=Math.max(amm[i-1],prev);
                }
                for (int num : map.keySet()) {
                    if (f1 == 1) {
                        break;
                    }
                    if (di <= num) {
                        prev = map.get(num);
                        f1 = 1;
                    }
                }

                for (int num : map.keySet()) {
                    if (f2 == 1)
                        break;
                    if (dist[i - 1] - 1 <= num) {
                        temp = map.get(num);
                        f2 = 1;
                    }
                }

                max = Math.max((prev + amm[i - 1]), temp);
                map.put((i == n) ? tot - 1 : dist[i], max);
            }
        }

        System.out.println(map.get(tot - 1));
    }
}
