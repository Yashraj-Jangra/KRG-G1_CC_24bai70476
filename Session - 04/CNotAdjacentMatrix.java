import java.util.*;

public class CNotAdjacentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(-1);
            } else {
                List<Integer> val = new ArrayList<>();
                for (int i = 1; i <= n * n; i += 2) {
                    val.add(i);
                }
                for (int i = 2; i <= n * n; i += 2) {
                    val.add(i);
                }
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < n * n; i++) {
                    ans.append(val.get(i)).append(" ");
                    if ((i + 1) % n == 0) {
                        ans.append("\n");
                    }
                }
                System.out.print(ans);
            }
        }
        sc.close();
    }
}