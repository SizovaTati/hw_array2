import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt(100000);
            array[i] = x + 100_000;
//            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        //Task 1

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\n");

        //Task 2

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //Task 3
        System.out.println();

        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
        }
        double averageValue = (double) sum1 / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        //Task 4
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i-- ) {
            System.out.print(reverseFullName[i]);
        }
    }
}