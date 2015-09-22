import java.util.Scanner;

public class _09_22_String {
	public static void main(java.lang.String[] args){
/*		// String class ===> char * char [], strcmp, strcpy, strlen
		
		Scanner scan = new Scanner(System.in);
		StringBuffer str1 = new StringBuffer(scan.next());
		
		// StringBuffer는 가변적인 문자열을 다루기 위한 class
		str1.append("bbb");
		str1.append(10);
		str1.append(new Object());
		str1.append("끝");
		
		System.out.println(str1.toString());
		*/
	//	str1+=str2;// 연산이 이루어지면 고정된 문자열만을 저장하는 특성상 빈번한 덧셈 연산이 이루어지면
		           // 다른 클래스를 사용하는 편이 좋다.
		
		
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