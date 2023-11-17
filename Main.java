import java.util.Scanner;
public class Main { //Лабораторная №11
    public static void main(String[] args) { //Задание №1
        Scanner sc = new Scanner(System.in); //Создание консольного ввода
        int n = sc.nextInt(); //Ввод первой переменной матрицы
        int m = sc.nextInt(); //Ввод второй переменной матрицы
        int[][] arr = new int[n][m]; //Создание матрицы

        for (int i = 0; i < n; i++) { //Цикл ввода матрицы построчено
            for (int j = 0; j < m; j++) {
                arr[i][j] = n * i + j;
            }
        }
        for (int i = 0; i < m; i++) { //Цикл вывода матрицы по столбцам
            for (int j = 0; j < n; j++) {
                System.out.println(arr[j][i]);
            }
            System.out.println();
        }
    }
}