import java.util.*;
import java.io.*;

public class Ehab_and_Path_etic_MEXs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] edges = new int[n - 1][2];
        int[] degree = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
        }
        int[] result = new int[n - 1];
        Arrays.fill(result, -1);
        int junctionNode = -1;
        for (int i = 1; i <= n; i++) {
            if (degree[i] >= 3) {
                junctionNode = i;
                break;
            }
        }
        if (junctionNode == -1) {
            for (int i = 0; i < n - 1; i++) {
                System.out.println(i);
            }
        } else {
            int labeledCount = 0;
            for (int i = 0; i < n - 1; i++) {
                if ((edges[i][0] == junctionNode || edges[i][1] == junctionNode) && labeledCount < 3) {
                    result[i] = labeledCount++;
                }
            }
            int remaining = labeledCount;
            for (int i = 0; i < n - 1; i++) {
                if (result[i] == -1) {
                    result[i] = remaining++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n - 1; i++) {
                sb.append(result[i]).append("\n");
            }
            System.out.print(sb);
        }
    }
}