package java_projects1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        Scanner list = new Scanner(file);
        // считываем фаил
        int count1 = 0;
        int count2 = 0;
        // переменные для счета

        while (list.hasNextLine()) {
            String text = list.nextLine();

            if (text.charAt(0) == "b".charAt(0)) {
                count1++;
            }
            if (text.charAt(0) == "a".charAt(0)) {
                count2++;
            }
        }

        list = new Scanner(file); // Обновляем фаил

        int[] a = new int[count2];
        int[] b = new int[count1];
        count1 = count2 = 0;

        // переменные a,b

        while (list.hasNextLine()) {
            String text = list.nextLine();

            if (text.charAt(0) == "b".charAt(0)) {

                b[count1] = Integer.parseInt(text.replace("b", "").replace(" ", ""));
                count1++;
            }
            if (text.charAt(0) == "a".charAt(0)) {

                a[count2] = Integer.parseInt(text.replace("a", "").replace(" ", ""));
                count2++;
            }
        }
        list.close();

        int index = Math.min(a.length, b.length);
        for (int i = 0; i < index; i++) {
            test(a[i], b[i]);
        }

    }

    static double MATH(double a, int b) {
        double num = a;
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        if (b > 0) {
            for (int i = 1; i < b; i++) {
                a = a * num;
            }
        } else {
            for (int i = 1; i > b; i--) {
                a = a / num;
            }
        }
        return a;
    }

    static void test(int a, int b) throws IOException {
        FileWriter file = new FileWriter("output.txt", true);
        if (a == 0) {
            file.write("а = " + " b = " + " ответ: не определено" + "\n");
            System.out.println("а = " + a + " b = " + b + " ответ: не определено");
        } 
        else{
            System.out.println("а = " + a + " b = " + b + " Ответ: " + MATH(a, b));
            file.write("а = " + a + " b = " + b + " Ответ: " + MATH(a, b) + "\n");
        }
        file.close();

    }
}