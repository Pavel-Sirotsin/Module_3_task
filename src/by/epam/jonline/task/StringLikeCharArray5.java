package by.epam.jonline.task;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class StringLikeCharArray5 {
	
	public static String findWSpace(String s) {

		char[] array = s.trim().toCharArray();
		String result = "";

		for (int i = 0; i < array.length; i++) {

			while (array[i] == ' ' && array[i + 1] == ' ') {
				i++;
			}
			result += Character.toString(array[i]);
		}

		return result;
	}

	public static void main(String[] args) {
		String input = "  33 cows,        33 cows,   33   cows ...  ";
		System.out.println("Before:|" + input + "|");
		System.out.print("After:|" + findWSpace(input) + "|");
	}
}