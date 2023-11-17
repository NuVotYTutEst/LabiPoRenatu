import java.util.Scanner;
public class Main2 { //Лабораторная №11
    public static void main (String[] args){ //Задание №4
        Scanner sc = new Scanner(System.in); //Создание консольного ввода
        int n = sc.nextInt(); //Ввод переменной матрицы
        int [][] arr = new int[n][n]; //Создание матрицы

        for (int i = 0; i < n; i++) { //Цикл ввода матрицы
            for (int j = 0; j < n; j++) {
                arr[i][j] = n * i + j;
            }
        }
        System.out.println("Матрица:"); //Цикл вывода матрицы (для ознакомления с ней)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) { //Цикл транспонированния матрицы
            for (int j = i+1; j < n; j++) {
                int arr2 = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = arr2;
            }
        }
        System.out.println();
        System.out.println("Транспонированная матрица:"); //Цикл вывода транспонированной матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
