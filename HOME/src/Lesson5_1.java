
public class Lesson5_1 {

	public static void main(String[] args) {

		int mass[] = { 3, 10, 9, 4, 4, 2, 5, 8 };
//		int mass[] = { 9, 3, 8, 7, 4, 8, 10, 8 };
//		int mass[] = { 9, 1, 8, 7, 4, 8, 5, 8 };
		int i;
		int m = mass[0];
		int n = mass[0];
		int min = 0;
		int max = 0;
		int sum = 0;
		for (i = 0; i < mass.length; i++) {
			if (m < mass[i]) {
				m = mass[i];
				max = i;
			}
			if (n > mass[i]) {
				n = mass[i];
				min = i;
			}
		}
		System.out.println("Max value= " + m + " Max index value= " + max);
		System.out.println("Min value= " + n + " Min index value= " + min);
		if (max > min) {
			for (; min + 1 < max; min++) {
				sum += mass[min + 1];
			}
		} else {
			for (; max + 1 < min; max++) {
				sum += mass[max + 1];
			}
		}
		System.out.println("Sum value beetwen min and max = " + sum);
	}

}
