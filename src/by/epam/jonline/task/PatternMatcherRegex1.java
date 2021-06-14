package by.epam.jonline.task;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
// отсортировать абзацы по количеству предложений;
// в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

public class PatternMatcherRegex1 {
	
	static String regForSentence = "[\\.\\?!]";
	static String regForLetter = "[\\w[^\\s,:;]]";
	static String regForToken = "[iI]";

	public static boolean notTheSame(int[] mas) {
		boolean b = false;
		for (int i : mas) {
			if (mas[0] != i)
				b = true;
		}
		return b;
	}

	public static String select() {
		String val;
		System.out.println(
				"Выберите номер операции: \r\n"
				+ "1) отсортировать абзацы по количеству предложений.\r\n"
				+ "2) в каждом предложении отсортировать слова по длине.\r\n"
				+ "3) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа (\"i\"), а в случае равенства – по алфавиту"
				+ "\r\n" + "4) \"Выход\"  \n");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNext("[1-4]")) {

			System.out.println("Enter 1, 2, 3 or 4");
			in.nextLine();

		}
		val = in.nextLine();

		return val;
	}

	public static int[] counter(String[] string, String regex) {
		int count = 0;

		int[] amount = new int[string.length];

		Pattern p = Pattern.compile(regex);

		for (int i = 0; i < string.length; i++) {
			count = 0;

			Matcher m = p.matcher(string[i]);

			while (m.find())
				count++;

			amount[i] = count;
		}
		return amount;
	}

	public static String[] sort(int[] arr, String[] mas) {
		for (int i = 0; i < arr.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			if (i != max) {
				swap(arr, i, max);
				swap(mas, i, max);
			}
		}
		return mas;
	}

	public static int[] swap(int[] mas, int i, int j) {
		int temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;
		return mas;
	}

	public static String[] swap(String[] s, int i, int j) {
		String temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		return s;
	}

	public static String sortParagraph(String text) {

		String[] sentences = text.split("(?<=)\r\n");

		sort(counter(sentences, regForSentence), sentences);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sentences.length; i++) {
			sb.append(sentences[i]);
			sb.append("\n\r\n");
		}

		return sb.toString();
	}

	public static String sortSentence(String text) {
		StringBuilder sb = new StringBuilder();
		String[] spliter = text.split("[\\.\\?!]");
		String[] sentence;

		for (int i = 0; i < spliter.length; i++) {

			sentence = spliter[i].split("[\\s&&[^\r\n]]");

			sort(counter(sentence, regForLetter), sentence);

			for (int j = 0; j < sentence.length; j++) {
				sb.append(sentence[j]);
				sb.append(" ");
			}
			sb.append(".");

		}

		return sb.toString();
	}

	public static String sortBySymbol(String text) {
		StringBuilder sb = new StringBuilder();

		int[] count;

		String[] splited = text.split("[\\.\\?!]");

		String[] sentence;

		for (int i = 0; i < splited.length; i++) {

			sentence = splited[i].split("[\\s&&[^\r\n]]");

			count = counter(sentence, regForToken);

			if (notTheSame(count) == false)
				Arrays.sort(sentence, String.CASE_INSENSITIVE_ORDER);
			else
				sort(count, sentence);

			for (int j = 0; j < sentence.length; j++) {
				sb.append(sentence[j]);
				sb.append(" ");
			}
			sb.append(".");

		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String choice;

		String input = "My name is Clark, and I will tell you about my city.\r\n" + "\r\n"
				+ "I live in an apartment. In my city, there is a post office where people mail letters. On Monday, I go to work."
				+ " I work at the post office. Everyone shops for food at the grocery store. They also eat at the restaurant. "
				+ "The restaurant serves pizza and ice cream.\r\n" + "\r\n"
				+ "My friends and I go to the park. We like to play soccer at the park. On Fridays, we go to the cinema to see a movie. "
				+ "Children don't go to school on the weekend. Each day, people go to the hospital when they are sick. "
				+ "The doctors and nurses take care of them. The police keep everyone safe. I am happy to live in my city.";

		choice = select();

		if (choice.equals("1"))
			System.out.println(sortParagraph(input));
		else if (choice.equals("2"))
			System.out.println(sortSentence(input));
		else if (choice.equals("3"))
			System.out.println(sortBySymbol(input));
		else if (choice.equals("4"))
			System.out.println("...Заходи, если что...! :)");

	}
}