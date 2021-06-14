package by.epam.jonline.task;

//3. В строке найти количество цифр.

public class StringLikeCharArray3 {

	public static int findDigit(String s) {
		char[] array = s.toCharArray();
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i]) == true)
				result++;
		}

		return result;
	}

	public static void main(String[] args) {
		String input = "My name is Paul and my birthday is 7th of july. Year what i was born it's 1986, The Tiger's year - 07/07/1986.";

		int amount = findDigit(input);

		System.out.print("Amount of digits: " + amount);
	}
}
