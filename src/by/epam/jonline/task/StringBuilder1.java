package by.epam.jonline.task;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class StringBuilder1 {

	public static int countWSpace(String s) {
		int count = 0;
		int max = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			count = 0;
			while (s.charAt(i) == ' ' && i < s.length() - 1) {
				count++;
				i++;
			}
			if (count > max)
				max = count;
		}
		return max;
	}

	public static void main(String[] args) {
		String input = "  33 cows,        33 cows,   33   cows ...  ";

		System.out.print("The biggest amount of consecutive spaces is: " + countWSpace(input));
	}
}
