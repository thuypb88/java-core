package lab_03;

import java.util.Scanner;

public class LoopExampleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isValid = false;

        while (!isValid) {
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
        }
        // Tính tổng từ 0 đến n
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Tổng từ 0 đến " + n + " là: " + sum);

        // Tính tích từ 1 đến n
        long product = 1;
        int j = 1; // Bắt đầu từ 1 để tránh nhân với 0
        if (n == 0) {
            product = 0;
        } else {
            while (j <= n) {
                product *= j;
                j++;
            }
        }
        System.out.println("Tích từ 1 đến " + n + " là: " + product);

        // Tính tổng các số chẵn từ 0 -> n
        int evenSum = 0;
        int k = 0;
        while (k <= n) {
            if (k % 2 == 0) {
                evenSum += k;
            }
            k++;
        }
        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + evenSum);

        scanner.close();
    }
}
