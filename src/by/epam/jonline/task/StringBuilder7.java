package by.epam.jonline.task;

// 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
// def", то должно быть выведено "abcdef".

public class StringBuilder7 {

	public static String format(String s) {
		StringBuilder st = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < i; k++) {

				if (s.charAt(i) == s.charAt(k) || s.charAt(i) == ' ')
					i++;
			}
			st.append(s.charAt(i));
		}
		return st.toString();
	}

	public static void main(String[] args) {
		String input = "abc cde def";

		System.out.print(format(input));
	}
}