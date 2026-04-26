import java.util.*;

public class AGameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Math.min(n, m) % 2 == 0 ? "Malvika" : "Akshat");
        sc.close();
    }
}