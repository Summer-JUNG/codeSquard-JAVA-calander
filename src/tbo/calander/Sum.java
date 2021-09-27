
package tbo.calander;

import java.util.Scanner;

//import java.util.Scanner;
//
//public class Sum {
//	public static void main(String[] args) {
//		System.out.println("두 수를 입력하세요.");
//		Scanner input1 = new Scanner(System.in);
//		String input2 = input1.nextLine();
//		String[] inputValue = input2.split(" ");
//		
//		int first = Integer.parseInt(inputValue[0]);
//		int second = Integer.parseInt(inputValue[1]);
//		
//		System.out.println("두 수의 합은 " + (first + second) + "입니다.");
//	}
//
//}

public class Sum {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d와 %d의 합은 %d 입니다.", a, b, a + b);
		scanner.close();
	}
}