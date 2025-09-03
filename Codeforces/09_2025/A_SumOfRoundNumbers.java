java
// https://codeforces.com/problemset/problem/1352/A
  
import java.util.*;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Vector<Integer> parts = new Vector<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    parts.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }

            System.out.println(parts.size());
            for (int x : parts) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
```
