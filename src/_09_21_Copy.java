import java.lang.reflect.Field;

/**
 * @author James
 * 
 * ���� ����: Deep copy -> ������ ī��
 * ���� ����: shallow copy -> ���� ����
 * 
 * reflection�� �Լ��� ȣ�� �ؼ� ������ �� �ִ�.
 *
 */

class Testa
{
	public int a;
	public String s;
	public int[] arr = new int[5];
	public int i;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
//	protected Object clone() throws CloneNotSupportedException { ������Ƽ�带 ������....!!!
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
		
	}
    
}

public class _09_21_Copy {
	private static final String Testa = null;

	public static void main(String[] args) throws ClassNotFoundException{
		
	Testa t1 = new Testa();
	t1.i = 10;
	t1.s = "ȫ�浿";
	for(int i : t1.arr){
		i = i*10;
	}
	
	Class c = Class.forName("Testa");
	System.out.println("class" + c.getName());
	System.out.println("{");
	Field [] fs = c.getFields();
	System.out.println("}");
	
	for (Field field:fs){
		System.out.println("" + field.getModifiers() + "" + field.getType());
		
		Testa t3 = new Testa();
		Testa t4 = t3;
		t3.s = "ȫ�浿";
		System.out.println(t4.s);
		t3.arr[0] = 100;
		System.out.println(t4.arr[0]);
	  }
	


	}
}
