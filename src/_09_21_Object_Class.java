import java.util.Scanner;

/**
 * 
 * @author James
 * 
 * =================
 * 	 Object Ŭ����
 * =================
 *  - �ڹ��� ��� Ŭ������ ObjectŬ������ ����Ѵ�.(���� Ŭ����)
 *  - C# --> Object MFC --> CObject
 *  - OOP ��� Ȥ�� OOP����� �����ӿ�ũ������ �ֻ��� �θ�κ��� ��� ���
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
		
		Studenta s1 = new Studenta(1, "ȫ�浿");
		Studenta s2 = new Studenta(1, "ȫ�浿");
		
		if(s1.equals(s2))
			System.out.println("����");
		
/*		Show(new String("AAA"));
		Show show = new Show();
		
		Scanner scanner = new Scanner(System.in);
		Show(scanner); // upCasting�̴�.
		System.out.println(scanner);
		System.out.println(show);
		
		String str1 = "AAA";
		String str2 = "BBB";
		str1 = str2;*/
	}

}
