package by.epam.jonline.task;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.

public class StringBuilder6 {
	
	public static String doubling(String s) {
		StringBuilder st = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			st.append(s.charAt(i));

			if (Character.isLetter(s.charAt(i))) {
				st.append(s.charAt(i));
			}

		}
		return st.toString();
	}

	public static void main(String[] args) {
		String input = "Go! Go, Johnny go! Go! Go, Johnny go! Go! Johnny B. Goode ";

		System.out.print(doubling(input));
	}
}
