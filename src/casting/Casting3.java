package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int 최댓값
        long maxIntOver = 2147483648L;  // int 최댓값 + 1
        int intValue = 0;

        intValue =  (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);
        intValue = (int) maxIntOver;  // 오버플로우
        System.out.println("maxIntOver casting  = " + intValue);
    }
}
