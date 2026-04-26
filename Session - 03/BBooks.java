import java.util.*;

public class BBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        long sum = 0;
        int ans = 0;
        while (j < n) {
            sum += a[j];
            while (sum > t) {
                sum -= a[i++];
            }
            if (sum <= t) {
                ans = Math.max(ans, j - i + 1);
            }
            j++;
        }
        System.out.println(ans);
        sc.close();
    }
}