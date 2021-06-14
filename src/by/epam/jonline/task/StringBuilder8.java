package by.epam.jonline.task;

// 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
// длинных слов может быть несколько, не обрабатывать.

public class StringBuilder8 {

	public static int findLongest(String s) {
		int count = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i)) == true)
				count++;
			else
				count = 0;

			if (count > max)
				max = count;
		}
		return max;
	}

	public static void main(String[] args) {
		String input = "The jump in atmospheric pressure was caused by a drop in air temperature.";

		System.out.print(findLongest(input));
	}
}
