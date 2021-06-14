package by.epam.jonline.task;

// 3. Проверить, является ли заданное слово палиндромом.

public class StringBuilder3 {

	public static boolean checkPalindroms(String s) {
		boolean b = false;

		s = s.replaceAll("\\W", "");

		StringBuilder st = new StringBuilder(s);

		String revers = st.reverse().toString();

		if (s.equalsIgnoreCase(revers))
			b = true;

		return b;
	}

	public static void main(String[] args) {
		String input = "Able was I ere I saw Elba";

		System.out.print(checkPalindroms(input));
	}
}
