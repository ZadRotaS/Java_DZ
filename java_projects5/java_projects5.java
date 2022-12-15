package java_projects5;

import java.io.Console;

public class java_projects5 {
    public static void main(String[] args) {
        Programm.code();
    }

    class Programm {

        static void code() {
            System.out.println(pyramid(inputInt("Введи целое число: ")));
        }

        static boolean isNumeric(String str) {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        static String pyramid(int num) {
            String pyramid = "*\n";
            String text = "";
            int x = 1;
            int i = 0;
            while (num >= x) {
                x += ++i + 1;
                text = text + pyramid;
                pyramid = "*" + pyramid;

            }
            if ((x - ++i) == num) return text;
            return ("Число: " + num + " было округлено до ближайшего минимального: " + (x - i) + "\nПирамида получается такая:\n" + text);
        }

        static int inputInt(String text) {
            Console console = System.console();
            String num = console.readLine(text);
            while (1 < 2) {
                if (isNumeric(num)) {
                    return Integer.parseInt(num);
                } else {
                    num = console.readLine("ERROR Ввели не число!!! Попробуйте еще раз\n" + text);
                }
            }
        }
    }
}
