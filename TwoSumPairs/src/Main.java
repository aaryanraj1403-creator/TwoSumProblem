import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        List<int[]> ans = new ArrayList<>();
        int l = 0, r = n - 1;

        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == target) {
                ans.add(new int[]{a[l], a[r]});
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        if (ans.isEmpty()) {
            System.out.println("No solution possible");
        } else {
            for (int[] pair : ans) {
                System.out.println("pair " + pair[0] + " " + pair[1]);
            }
        }

        sc.close();
    }
}
