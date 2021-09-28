package tbo.calander;

import java.util.Scanner;

public class Calander {

	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static int switchCalander(int month) {
		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static void printSampleCalander() {
		System.out.println(" 일 월  화 수  목 금  토 ");
		System.out.println("---------------------");
		System.out.println("  1  2  3  4  5  6  7");
		System.out.println("  8  9 10 11 12 13 14");
		System.out.println(" 15 16 17 18 19 20 21");
		System.out.println(" 22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		String PROMPT = "Cal> ";
		Scanner scanner = new Scanner(System.in);
		Calander cal = new Calander();
		
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			if (month == -1) {
				break;
			} else if (month > 12 || month <1) {
				continue;
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Done");
		scanner.close();
	}

}
