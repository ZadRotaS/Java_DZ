package java_projects4;

public class java_project4 {
    public static void main(String[] args) {
        Programm.programm();
    }

    class Programm {
        public static void programm() {
            int[][] map = {
                    { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                    { -1, -0, -1, -0, -0, -0, -1, -0, -0, -0, -0, -1 },
                    { -1, -0,  1, -1, -0, -0, -0, -0, -1, -1, -0, -1 },
                    { -1, -0, -1, -0, -0, -0, -0, -0, -1, -0, -0, -1 },
                    { -1, -0, -0, -0, -0, -0, -1, -0, -1, -0, -1, -1 },
                    { -1, -0, -0, -1, -1, -0, -1, -0, -1, -0, -0, -1 },
                    { -1, -0, -0, -1, -0, -0, -1, -0, -0, -1, -0, -1 },
                    { -1, -0, -0, -1, -0, -0, -1, -0, -0, -1, -0, -1 },
                    { -1, -0, -0, -0, -1, -0, -1, -0, -0, -1, -0, -1 },
                    { -1, -0, -0, -0, -1, -0, -1, -0, -0, -1, -2, -1 },
                    { -1, -0, -2, -0, -0, -0, -1, -0, -0, -0, -0, -1 },
                    { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 } };
            
            for (int index = 1; index < 100; index++) {
                fillArr(map, index);
            }
            arrPrint(map);

        }

      

        static void arrPrint(int arr[][]) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print((i + 1) + ": ");
                if (10 > i + 1)
                    System.out.print(" ");
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] == -1)
                        System.out.print("#  ");
                    else if (arr[i][j] == -2)
                        System.out.print("Q  ");
                    else {
                        if (arr[i][j] > 9)
                            System.out.print(arr[i][j] + " ");
                        else
                            System.out.print(arr[i][j] + "  ");
                    }

                }

                System.out.println(" ");
            }
        }

        static int[][] fillArr(int[][] arr, int count) {
            for (int i = 1; i < arr.length - 1; i++) {
                for (int j = 1; j < arr.length - 1; j++) {
                    if (arr[i][j] == count) {
                        if (arr[i - 1][j] == 0 && arr[i - 1][j] < count) {
                            if (arr[i - 1][j] != -2) {
                                arr[i - 1][j] = count + 1;
                            }
                        }
                        if (arr[i + 1][j] == 0 && arr[i + 1][j] < count) {
                            if (arr[i + 1][j] != -2) {
                                arr[i + 1][j] = count + 1;
                            }
                        }
                        if (arr[i][j - 1] == 0 && arr[i][j - 1] < count) {
                            if (arr[i][j - 1] != -2) {
                                arr[i][j - 1] = count + 1;
                            }
                        }
                        if (arr[i][j + 1] == 0 && arr[i][j + 1] < count) {
                            if (arr[i][j + 1] != -2) {
                                arr[i][j + 1] = count + 1;
                            }
                        }
                    }
                }
            }
            return arr;
        }

    }
}
