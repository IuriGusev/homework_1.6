public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // task 1
        int[] spendingOfMonth = {100, 101, 105, 110, 111, 115, 120, 121, 125, 130, 131, 135, 140, 141, 145, 150, 151, 155, 160, 161, 165, 170, 171, 175, 180, 181, 185, 190, 195, 200};
        int sum = 0;
        for (int element : spendingOfMonth) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " тысяч рублей.");

        // task 2
        int max = -1;
        for (int i = 0; i < spendingOfMonth.length; i++) {
            if (spendingOfMonth[i] > max) {
                max = spendingOfMonth[i];
            }
        }
        System.out.println(max);

        int min = spendingOfMonth[0];
        for (int i = 0; i < spendingOfMonth.length; i++) {
            if (spendingOfMonth[0] < min) {
                min = spendingOfMonth[0];
            }
        }
        System.out.println(min);
        System.out.println("Минимальная сумма трат за день составила " + min + " тысяч рублей. Максимальная сумма трат за день составила "+ max + " тысяч рублей");

        // task 3
        System.out.println("Средняя сумма трат в месяц составила " + sum/spendingOfMonth.length + " тысяч рублей.");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i -= 1) {
            System.out.print(reverseFullName[i]);
        }
    }
}