// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("\n" + "Задача 1" + "\n");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            break;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        int arr[] = generateRandomArray();
        int minOutlay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minOutlay) {
                minOutlay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minOutlay);
        int maxOutlay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxOutlay) {
                maxOutlay = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxOutlay);
    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");
        int arr[] = generateRandomArray();
        int sumInMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumInMonth += arr[i];
        }
        double spendedForMonth = sumInMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + spendedForMonth + " рублей.");
    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}
