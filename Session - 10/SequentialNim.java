import java.util.Scanner;

public class SequentialNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = 0;
            while (k < n && a[k] == 1) {
                k++;
            }
            if (k == n) {
                if (n % 2 == 1) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (k % 2 == 0) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
        sc.close();
    }
}