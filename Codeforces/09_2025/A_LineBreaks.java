java
// Problem: A. Line Breaks
// URL: https://codeforces.com/problemset/problem/2050/A
// Date Solved: 2025-09-02


import java.util.*;

public class A_LineBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            int count = 0;
            int used = 0;

            for (int i = 0; i < n; i++) {
                if (used + words[i].length() <= m) {
                    used += words[i].length();
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
```
