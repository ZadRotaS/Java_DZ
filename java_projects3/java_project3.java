package java_projects3;

public class java_project3 {
    public static void main(String[] args) {
       
        System.out.println(test(3, 27, 3, 2));
        

    }

    static String test(int a, int b, int c, int d) {
        String text = Integer.toString(b) + " = ";
        int x = b;
        if (a < b) {
            while (x > a) {
                if (x % c == 0 & x / c >= a) {
                    x = x / c;
                    text += Integer.toString(c) + " * ";
                } else {
                    x = x - d;
                    text += Integer.toString(d) + " + ";
                }
            }
            return text(text + Integer.toString(a));
        } else {
            return "Невозможно";

        }
    }

    static String text(String text) {
        String[] text2 = text.split(" ");
        String text3 = "";
        for (int i = text2.length - 1; i >= 0; i--) {
            text3 += text2[i];
        }
        return text3;
    }

}
