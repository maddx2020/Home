
public class Lesson6_1 {
	public static void main(String[] args) {
		String s = "� ���� ������ ��������� ��������";
//		String s = "  ����� ���� ������� � ������!";
//		String s = " ����� ���� � � ������ � � ����� ";
		String sn = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= '�') && s.charAt(i) <= '�') {
				sn += s.charAt(i);
			} else {
				if (!sn.equals("")) {
					sn = "";
					count++;
				}
			}
		}
		if (!sn.equals("")) {					//��������, ��� ����� ���������� ����� �� ����� ������� ���� � ��� ����� �����������
			count++;
		}
		System.out.println(count);
	}
}
