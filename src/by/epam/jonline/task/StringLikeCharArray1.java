package by.epam.jonline.task;

import java.util.Arrays;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class StringLikeCharArray1 {

	public static String[] format(String[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = toChar(mas[i]);
			mas[i] = mas[i].toLowerCase();
		}
		return mas;
	}

	public static String toChar(String s) {
		char[] array = s.toCharArray();
		String result = "";
		int n = array.length - 1;

		for (int i = 0; i < n; i++) {
			result += Character.toString(array[i]);
			if (Character.isUpperCase(array[i + 1]) == true)
				result += Character.toString('_');
		}
		result += Character.toString(array[n]);

		return result;
	}

	public static void main(String[] args) {
		String[] nameOfVar = { "enterFrom", "getNumber", "checkResult", "freeElement", "countPosition" };

		nameOfVar = format(nameOfVar);

		System.out.print(Arrays.toString(nameOfVar));

	}
}
