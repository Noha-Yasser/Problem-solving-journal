```java
// Problem: B. ICPC Balloons
// Link: https://codeforces.com/problemset/problem/1703/B


import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next().toUpperCase();

            int[] freq = new int[26];
            int total = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                int index = c - 'A';

                if (freq[index] == 0) {
                    total += 2;
                } else {
                    total += 1;
                }
                freq[index]++;
            }

            System.out.println(total);
        }
    }
}
```

