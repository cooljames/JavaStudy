import java.util.Scanner;

/**
 * 
 * @author James
 * 
 * =================
 * 	 Object 클래스
 * =================
 *  - 자바의 모든 클래스는 Object클래스를 상속한다.(조상 클래스)
 *  - C# --> Object MFC --> CObject
 *  - OOP 언어 혹은 OOP언어의 프레임워크에서는 최상위 부모로부터 모두 상속
 */

class Studenta
{
	private int Sno;
	private String Name;
	
	public Studenta(int no, String name)
	{
		Sno = no;
		this.Name=name;
	}
	public boolean equals(Object obj){
		this.Sno=((Studenta)obj).Sno && this.Name == ((Studenta)obj).Name)
		return true;
					else
		return false;
	}
}
public class _09_21_Object_Class {
	
	public static void Show(Object o) {o.toString();}
	public static void main(String[] args){
		
		Studenta s1 = new Studenta(1, "홍길동");
		Studenta s2 = new Studenta(1, "홍길동");
		
		if(s1.equals(s2))
			System.out.println("같다");
		
/*		Show(new String("AAA"));
		Show show = new Show();
		
		Scanner scanner = new Scanner(System.in);
		Show(scanner); // upCasting이다.
		System.out.println(scanner);
		System.out.println(show);
		
		String str1 = "AAA";
		String str2 = "BBB";
		str1 = str2;*/
	}

}
