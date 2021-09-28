package tbo.calander;

import java.util.Scanner;

public class Calander {
	
	public static void main(String[] args) {
		System.out.println(" 일 월  화 수  목 금  토 ");
		System.out.println("---------------------");
		System.out.println("  1  2  3  4  5  6  7");
		System.out.println("  8  9 10 11 12 13 14");
		System.out.println(" 15 16 17 18 19 20 21");
		System.out.println(" 22 23 24 25 26 27 28");
		
		System.out.println("달을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if ((input <= 7 && input % 2 == 1) || (input >= 8 && input % 2 == 0)) {
			System.out.printf("%d월은 31일까지 있습니다.", input);
		} else if (input == 2) {
			System.out.printf("%d월은 28일까지 있습니다.", input);
		} else {
			System.out.printf("%d월은 30일까지 있습니다.", input);
		}
		scanner.close();
	}

}
