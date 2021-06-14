package by.epam.jonline.task;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class StringBuilder5 {

	public static int format(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "Go hang a salami, I'm a lasagna hog";

		System.out.print(format(input));
	}
}
