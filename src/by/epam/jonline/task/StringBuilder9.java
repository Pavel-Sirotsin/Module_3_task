package by.epam.jonline.task;

// 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
// буквы.

public class StringBuilder9 {

	public static String countUpLowCase(String s) {
		int countUp = 0;
		int countLow = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i)) == true && Character.isLetter(s.charAt(i)))
				countUp++;
			else if (Character.isLowerCase(s.charAt(i)) == true && Character.isLetter(s.charAt(i)))
				countLow++;

		}
		return countUp + " " + countLow;
	}

	public static void main(String[] args) {
		String input = "World War II (WWII or WW2), also known as the Second World War, was a global war that lasted from 1939 to 1945.";

		System.out.println("Amount of:");
		System.out.println("UpperCase | LowerCase\t");
		System.out.print("\t" + countUpLowCase(input));
	}
}
