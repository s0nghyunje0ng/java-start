package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;  // m 생존 시작

        for (int i = 0; i < 2; i++) {  // i 생존 시작
            System.out.println("for m = " + m);  // 블록 내부에서 외부 접근 가능
            System.out.println("for i = " + i);
        }  // i 생존 종료

        System.out.println("main m = " + m);
        // System.out.println("main i = " + i);  // 오류
    }  // m 생존 종료
}
