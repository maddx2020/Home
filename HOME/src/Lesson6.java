
public class Lesson6 {
	public static void main(String[] args) {
//		String s = "Текст, с несколькими запятыми. И точками.";
		String s = "Знаков препинания: ,;.?! может быть много?!";

		int count = 0;
		char symbol;
		for (int i = 0; i < s.length(); i++) {
			symbol = s.charAt(i);
			if ((symbol == ',') || (symbol == '.') || (symbol == ':') || (symbol == ';') || (symbol == '?')
					|| (symbol == '!'))
				count++;
		}
		System.out.println(count + " совпадений");

	}

}
