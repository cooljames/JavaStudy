/**
 *  @author bit-user

 *  ~10 �� -11�� �Ǵ� ������ Shift(bit ����)
 *  ����� 0000 0000 0���� �ϳ��� 1�� ä�������� ���ڸ� ���
 *  ������ 1111 1111 -1���� �ϳ��� 1�� ���������� ���ڸ� ���
 *  java Operator�� ������ �̷������ ���� ������ ����� Integer + Integer = Float
 */

public class _09_04_Operator {

public static boolean TRUE(){
	System.out.println("TRUE");
	return true;
}

public static boolean False(){
	System.out.println("FALSE");
	return false;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(TRUE() |  False())
			System.out.println("AAA");
		
		byte b= 10;
		System.out.println("~b = " + ~b);
		
		byte c= 10;
		System.out.println("c >> 2 = " + (c >> 2));
		
		byte d= -11;
		System.out.println("d >>> 2 = " + (d >>> 2));
	}
}

