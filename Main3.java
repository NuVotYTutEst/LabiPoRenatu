import java.util.Scanner;
public class Main3 { //Лабораторная №11
    public static void main(String[] args) { //Задание №5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {  //Цикл ввода матрицы
            for (int j = 0; j < n; j++) {
                arr[i][j] = n * i + j;
            }
        }
        System.out.println("Матрица:");
        for (int i = 0; i < n; i++){ //Цикл вывода матрицы (для ознакомления с ней)
            for (int j = 0; j < n; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) { //Цикл вычисления суммы главной диагонали
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.println("Сумма главной диагонали: " + sum1);

        for (int i = arr.length - 1; i >= 0; i--) { //Цикл вычисления суммы побочной диагонали
            sum2 += arr[i][arr.length - 1 - i];
        }
        System.out.println("Сумма побочной диагонали: " + sum2);

        if (sum1 > sum2){
            System.out.println("Сумма главной диагонали больше");
        }
        if (sum1 < sum2){
            System.out.println("Сумма побочной диагонали больше");
        }
        if (sum1 == sum2) {
            System.out.println("Суммы диагоналей равны");
        }
    }
}


