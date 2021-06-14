package by.epam.jonline.task;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class StringBuilder4 {

	public static String format(String s) {
		s = s.substring(7, 8) + s.substring(3, 4) + s.substring(4, 5) + s.substring(7, 8);
		return s;
	}

	public static void main(String[] args) {
		String input = "информатика";

		System.out.print(format(input));
	}
}
