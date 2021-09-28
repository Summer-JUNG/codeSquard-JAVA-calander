package tbo.calander;

import java.util.Scanner;

public class selfPrac {
    public static void main(String[] args) {
        System.out.println("숫자를 입력 하시오.");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.next();
        s2 = scanner.next();

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        scanner.close();
        System.out.printf("%d과 %d의 합은 %d입니다.", a, b, a + b);
    }
}
