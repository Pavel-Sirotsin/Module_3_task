package by.epam.jonline.task;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class StringLikeCharArray2 {

	public static String formatCharArray(String s) {
		s = s.toLowerCase();
		char[] array = s.toCharArray();
		String result = "";

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 'w' && array[i + 1] == 'o' && array[i + 2] == 'r' && array[i + 3] == 'd') {
				result += "Letter";
				i += "word".length();

			}
			result += Character.toString(array[i]);
		}

		return result;

	}

	public static void main(String[] args) {

		String input = "Word isn't a bird, flies out - willn't catch!" + "\r\nWording of word!\r\n"
				+ "Word written with pen - wouldn't cut out with axe!";

		System.out.printf("%s \n\n", input);

		System.out.printf("%s \n\n", formatCharArray(input)); // formated like Character array

		System.out.println(input.replaceAll("Word|word", "Letter")); // formated using regex in replace function
	}
}