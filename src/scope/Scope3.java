package scope;

public class Scope3 {
    public static void main(String[] args) {
        // 나쁜 예
        int m1 = 10;
        int temp1 = 0;  // 비효율적인 메모리 사용 + 코드 복잡성 증가
        if (m1 > 0) {
            temp1 = m1 * 2;
            System.out.println("temp1 = " + temp1);
        }
        System.out.println("m1 = " + m1);

        // 좋은 예
        int m2 = 10;
        if (m2 > 0) {
            int temp2 = m2 * 2;  // if문 내에서만 사용하므로 코드 블록 내부에서 선언
            System.out.println("temp2 = " + temp2);
        }
        System.out.println("m2 = " + m2);
    }
}
