import java.util.Scanner;

public class _09_22_String {
	public static void main(java.lang.String[] args){
/*		// String class ===> char * char [], strcmp, strcpy, strlen
		
		Scanner scan = new Scanner(System.in);
		StringBuffer str1 = new StringBuffer(scan.next());
		
		// StringBuffer�� �������� ���ڿ��� �ٷ�� ���� class
		str1.append("bbb");
		str1.append(10);
		str1.append(new Object());
		str1.append("��");
		
		System.out.println(str1.toString());
		*/
	//	str1+=str2;// ������ �̷������ ������ ���ڿ����� �����ϴ� Ư���� ����� ���� ������ �̷������
		           // �ٸ� Ŭ������ ����ϴ� ���� ����.
		
		
		String str = "Korea Bit ";
		
		System.out.println(str.equals(str));
		System.out.println(str.trim());
		System.out.println("");
		
		String s = " a";
		String s1 = "a";
		
		if(s.trim().equals(s1))
			System.out.println(str.trim());
		
		System.out.println(str.concat(s1));
		System.out.println(str.charAt(3));
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(str.length()));
		System.out.println(str.indexOf("<hr>"));
		System.out.println(str.replaceAll("Bit", ""));
		
		String sp ="#name#ages#cellular#birthday";
		String[] sparr = sp.split("#");
		for (String string: sparr){
			System.out.println(string);
		}
		
	}
}