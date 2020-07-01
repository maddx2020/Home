
public class Lesson6_1 {
	public static void main(String[] args) {
		String s = "¬ этом тексте несколько пробелов";
//		String s = "  «десь есть пробелы в начале!";
//		String s = " «десь есть и в начале и в конце ";
		String sn = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'ј') && s.charAt(i) <= '€') {
				sn += s.charAt(i);
			} else {
				if (!sn.equals("")) {
					sn = "";
					count++;
				}
			}
		}
		if (!sn.equals("")) {					//проверка, что после последнего слова не стоит никакой знак и это слово учитываетс€
			count++;
		}
		System.out.println(count);
	}
}
