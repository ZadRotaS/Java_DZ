package Ex1_java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class java_porjects2 {
    public static void main(String[] args) throws IOException {
        Exercise.ex01();

    }
}

class Exercise {
    public static void ex01() throws IOException {
        int[] arr = new int[9];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20 - 10);
            if (arr[i] > 0)
                x += arr[i];
            else
                y += arr[i];

        }
        outputArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма положительных числеь = " + x + " Сумма отрицательных чисел = " + y
                + "\n" + "Сумма всех чисел = " + (x + y));

    }
    public static void outputArr(int[] arr) throws IOException{
        FileWriter file = new FileWriter("output.txt", true);
        file.write(Arrays.toString(arr));
    }
}   