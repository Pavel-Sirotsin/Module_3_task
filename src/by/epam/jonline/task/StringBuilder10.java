package by.epam.jonline.task;

// 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

public class StringBuilder10 {

	public static int countSentences(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?')
				count++;

		}
		return count;
	}

	public static void main(String[] args) {
		String input = "I promise you , it's true! Why don't you believe me? Because I saw you run to your car and then jump up and drive away.";

		System.out.println("Amount of sentences: " + countSentences(input));
	}
}
