import java.util.Arrays;

public class Main {
    // task1 - Инициализация массивов (Для удобства выполнения ДЗ использую статические переменные).
    static int[] arr1 = new int[]{1, 2, 3};
    static double[] arr2 = {1.57, 7.654, 9.986};
    static boolean[] arr3 = {true, false, false, true, true};

    public static void task2() {
        System.out.println("Вывод всех элементов каждого массива по порядку через запятую.");
        System.out.println("Массив 1:");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(" " + arr1[i] + '\n');
                break;
            }
            System.out.print(" " + arr1[i] + ",");
        }
        System.out.println("Массив 2:");
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(" " + arr2[i] + '\n');
                break;
            }
            System.out.print(" " + arr2[i] + ",");
        }
        System.out.println("Массив 3:");
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(" " + arr3[i] + '\n');
                break;
            }
            System.out.print(" " + arr3[i] + ",");
        }
    }

    public static void task3() {
        System.out.println("Вывод всех элементов каждого массива в обратном порядке через запятую.");
        System.out.println("Массив 1:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(" " + arr1[i] + '\n');
                break;
            }
            System.out.print(" " + arr1[i] + ",");
        }
        System.out.println("Массив 2:");
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(" " + arr2[i] + '\n');
                break;
            }
            System.out.print(" " + arr2[i] + ",");
        }
        System.out.println("Массив 3:");
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(" " + arr3[i] + '\n');
                break;
            }
            System.out.print(" " + arr3[i] + ",");
        }
    }

    public static void task4() {
        System.out.println("Изменение нечетных чисел в массиве.");
        System.out.println(" Исходный массив - " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(" Измененный массив - " + Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }
}