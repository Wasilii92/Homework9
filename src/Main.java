import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray(int size) {
        java.util.Random random = new java.util.Random();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int payMonth[] = generateRandomArray(5);
        for (int element : payMonth) ;
        System.out.println(Arrays.toString(payMonth));
        int sum = 0;
        for (int i = 0; i < payMonth.length; i++) {
            sum += payMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int payWeek[] = generateRandomArray(5);
        for (int element : payWeek) ;
        System.out.println(Arrays.toString(payWeek));
        int maxPay = payWeek[0];
        for (int current : payWeek) {
            if (current > maxPay) {
                maxPay = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю равна " + maxPay + " рублей");
        int minPay = payWeek[0];
        for (int current : payWeek) {
            if (current < minPay) {
                minPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю равна " + minPay + " рублей");
        int payAverage[] = generateRandomArray(5);
        for (int current : payAverage);
        System.out.println(Arrays.toString(payAverage));
        int sumForAv = 0;
        int average=0;
        for (int i = 0; i < payMonth.length; i++) {
            sumForAv += payAverage[i];
            average=sumForAv/payAverage.length;
        }
System.out.println("Средняя сумма трат за месяц составляет "+average+" рублей");

        char []reverseFullName={'n','a','v','I',' ','v','o','n','a','v','I'};
        for(int i=reverseFullName.length-1; i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    }



