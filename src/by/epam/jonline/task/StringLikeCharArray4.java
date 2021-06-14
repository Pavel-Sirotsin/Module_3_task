package by.epam.jonline.task;

//4. В строке найти количество чисел.

public class StringLikeCharArray4 {
	
	public static int findNumber(String s) {

		char[] array = s.toCharArray();
		int result = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			count = 0;
			while (Character.isDigit(array[i]) == true) {
				count++;
				i++;
			}
			if (count > 1)
				result++;

		}
		return result;
	}

	public static void main(String[] args) {
		String input = "Adress #1: Nekrasowa str. 29 - 116, 10-entrance, 12-floor.";

		int amount = findNumber(input);

		System.out.print("Amount of numbers: " + amount);
	}
}
