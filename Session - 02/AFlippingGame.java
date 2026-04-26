import java.util.*;

public class AFlippingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                cnt++;
            }
        }
        int ans = -(int) 1e9;
        for (int i = 0; i < n; i++) {
            int z = 0;
            int o = 0;
            for (int j = i; j < n; j++) {
                if (a[j] == 0) {
                    z++;
                } else {
                    o++;
                }
                ans = Math.max(ans, cnt - o + z);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}