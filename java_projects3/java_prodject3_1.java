package java_projects3;

public class java_prodject3_1 {
    public static void maisn(String[] args) {
        // System.out.println(f(1, 14, 1, 2));
        System.out.println(f1(6, 1, 2, 5));

    }

    static int f(int a, int b, int c, int d) {
        int count = 0;
        int x = a;
        while (a < b) {
            if (a % d != c - 1) {
                a = a - c;
                count++;
            }
            if (a % d == 0) {
                a = (a - c) + (a / d);
                count++;
            }
        }
        return count;
    }

    static int f1(int a, int c, int d, int x) {
        if (x % d != 0) {
            x = x - c;
            return x;
        }
        if (x % d == 0) {
            x = (x - c) + (x / d) - 1;
            return x;
        }
        return a;
    }
}
