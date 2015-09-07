/**
 *  @author bit-user

 *  ~10 이 -11이 되는 이유는 Shift(bit 단위)
 *  양수는 0000 0000 0에서 하나씩 1을 채워나가며 숫자를 기록
 *  음수는 1111 1111 -1에서 하나씩 1을 지워나가며 숫자를 기록
 *  java Operator는 연산이 이루어지면 상위 단위로 변경됨 Integer + Integer = Float
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

