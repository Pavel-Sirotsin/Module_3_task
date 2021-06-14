package by.epam.jonline.task;

// 2. В строке вставить после каждого символа 'a' символ 'b'.

public class StringBuilder2 {

	public static String insertion(String s) {
		StringBuilder st = new StringBuilder(s);

		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == 'a' || s.charAt(j) == 'A') {

				st.insert(j + 1, "|b|");
				s = st.toString();
			}
		}
		return st.toString();
	}

	public static String format(String s) {
		StringBuilder st = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			st.append(s.charAt(i));

			if (s.charAt(i) == 'a' || s.charAt(i) == 'A')
				st.append("|b|");

		}
		return st.toString();
	}

	public static void main(String[] args) {
		String input = "After a long day, I decided to make a delicious cocktail and try to relax in the big warm bath.";

		System.out.println("sb.insert() : " + insertion(input) + "\n"); 

		System.out.print("sb.append() : " + format(input)); // Usisng method append() by StringBuilder;
	}
}
