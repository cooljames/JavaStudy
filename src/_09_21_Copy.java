import java.lang.reflect.Field;

/**
 * @author James
 * 
 * 깊은 복사: Deep copy -> 완전한 카피
 * 얕은 복사: shallow copy -> 참조 복사
 * 
 * reflection은 함수를 호출 해서 보여줄 수 있다.
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
//	protected Object clone() throws CloneNotSupportedException { 프로텍티드를 재정의....!!!
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
	t1.s = "홍길동";
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
		t3.s = "홍길동";
		System.out.println(t4.s);
		t3.arr[0] = 100;
		System.out.println(t4.arr[0]);
	  }
	


	}
}
