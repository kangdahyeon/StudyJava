package Test;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		if(index == -1) { // -1�� ã�� ���ڰ� ���� �����. != 0 ���ε� ��ü �����ҵ�.
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "Java");
			System.out.println("-->" + str);
		}
	}
}
