/**
 * 
 */


/**
 * @author bit-user
 *
 */

//============================================================
//    static ��� �Լ�  :  static method  
//  -->  ��ü���� ȣ�Ⱑ���� Ŭ������ �ൿ !! 
//============================================================

class KoreanPerson 
{
	static String Nation = "���ѹα�";    // ���� :  
	String name; 
	int age = 1 ; 
	static
	{
		Nation = "�ѱ�";
	}
	
	KoreanPerson()
	{
		this("ȫ�浿");	// this() :  �ٸ� �����ڸ� ȣ�� !! 
	}
	KoreanPerson(String name )
	{	
		this.name = name;  // this �ǹ�  
	}	
	void BirthDay() 
	{
		age++;
	} 	

	static String KOREA() {  return Nation;   }
	
	
	// static �޼���� static �ʵ忡�� ���� ���� !! 
	// static �޼���� ��ü�ʹ� ����� ���� !! 
	// Ŭ������ ���� ���� �ϴ� �޼��� !! 
	/*static int getAge()  // ���̸� �������� �޼��� !! 
	{
		return age; 
	}*/ 
		
}
public class _09_10_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KoreanPerson p =  new KoreanPerson(); 
		System.out.println( p.KOREA()  ); 	// ��ü�� ���� ���� 
		System.out.println( p.Nation    );	// ��ü 
		System.out.println( KoreanPerson.Nation  ); //??  Nation static  ��ü ���� ���� !! 
		System.out.println( KoreanPerson.KOREA());   //  Ŭ���� �̸����� ���� !! 
		
		
	}

}
