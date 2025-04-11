package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int maxNum = numbers[0];
        int minNum = numbers[0];

        for (int i = 0; i < n; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            } else if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
