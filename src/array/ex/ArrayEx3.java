package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: ");
        for (int num : numbers) {
            System.out.print(num);
            if (num != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
    }
}
