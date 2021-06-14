package by.epam.jonline.task;

import java.util.regex.*;

/* 2. Дана строка, содержащая следующий текст (xml-документ):
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.*/

public class PatternMatcherRegex2 {
	
	static String findOpenTeg = "(?:<[^\\/]).*?[^\\/]>";

	static String findTegContent = ">.+?<";

	static String noBody = "<.+?\\/>";

	static String findClosedTeg = "<\\/.+?>";

	public static void findOpenTeg(String text) {
		Pattern p = Pattern.compile(findOpenTeg);
		Matcher m = p.matcher(text);

		if (m.find()) {
			System.out.printf("%6s%27s\n", "open:", m.group());

		}
	}

	public static void findTegContent(String text) {
		Pattern p = Pattern.compile(findTegContent);
		Matcher m = p.matcher(text);

		if (m.find()) {
			System.out.printf("%11s%22s\n", "content:", m.group());
		}

	}

	public static void findClosedTeg(String text) {
		Pattern p = Pattern.compile(findClosedTeg);
		Matcher m = p.matcher(text);

		if (m.find()) {
			System.out.printf("%11s%22s\n", "close:", m.group());
		}

	}

	public static void noBody(String text) {
		Pattern p = Pattern.compile(noBody);
		Matcher m = p.matcher(text);

		if (m.find()) {
			System.out.printf("%7s%26s\n", "noBody", m.group());
		}

	}

	public static void format(String text) {
		Pattern p = Pattern.compile("\r\n");
		String[] mas = p.split(text);
		for (int i = 0; i < mas.length; i++) {
			findOpenTeg(mas[i]);
			findTegContent(mas[i]);
			findClosedTeg(mas[i]);
			noBody(mas[i]);
		}

	}

	public static void main(String[] args) {

		String input = "<notes>\r\n" + 
				"<note id = \"1\">\r\n" + 
				"<to>Вася</to>\r\n" + 
				"<from>Света</from>\r\n" + 
				"<heading>Напоминание</heading>\r\n" + 
				"<body>Позвони мне завтра!</body>\r\n" + 
				"</note>\r\n" + 
				"<note id = \"2\">\r\n" + 
				"<to>Петя</to>\r\n" + 
				"<from>Маша</from>\r\n" + 
				"<heading>Важное напоминание</heading>\r\n" + 
				"<body/>\r\n" + 
				"</note>\r\n" + 
				"</notes>";
		
		format(input);

	}
}
