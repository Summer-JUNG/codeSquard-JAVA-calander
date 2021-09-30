package tbo.calander;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "Cal> ";

	public static void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calander cal = new Calander();

		while (true) {
			System.out.println("연도를 입력하세요.");
			System.out.print("Year> ");
			int year = scanner.nextInt();

			System.out.println("월을 입력하세요.");
			System.out.print("Month> ");
			int month = scanner.nextInt();

			if (month == -1) {
				break;
			} else if (month > 12 || month < 1) {
				continue;
			}
			cal.printCalander(year, month);
		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}