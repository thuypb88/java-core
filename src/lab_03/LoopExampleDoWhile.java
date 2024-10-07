package lab_03;

import java.util.Scanner;

public class LoopExampleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isValid = false;

        do {
            System.out.print("Mời bạn nhập vào 1 số nguyên: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Vui lòng nhập một số nguyên.");
                }
            } else {
                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.");
                scanner.next();
            }
        } while (!isValid);

        // 1. Tính tổng từ 0 -> n
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Tổng các số từ 0 đến " + n + " là: " + sum);

        // 2. Tính tích từ 1 -> n
        long product = 1;
        int j = 1;
        if (n == 0) {
            product = 0;
        } else {
            do {
                product *= j;
                j++;
            } while (j <= n);
        }
        System.out.println("Tích các số từ 1 đến " + n + " là: " + product);

        // 3. Tính tổng các số chẵn từ 0 -> n
        int evenSum = 0;
        int k = 0;
        do {
            if (k % 2 == 0) {
                evenSum += k;
            }
            k++;
        } while (k <= n);
        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + evenSum);

        scanner.close();
    }
}
