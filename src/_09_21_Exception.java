/**
 * @author James
 *
 * -> error 오류: 문법, 실행오류, 치명적인 오류, 메모리, JVM오류
 * -> exception 예외: 예상치 못한 상황에 대한 처리
 *====================================
 *
 *
 */
public class _09_21_Exception {

	public static void main(String args[]) throws Exception  {
	
		int value = 10;
		int devide = 0;
		
		
		try{
			
		for (int i = 0; i < args.length; i++) {
			
		}

		}
		
		catch(Exception  e)
		{
			System.out.println(e.getMessage());
			System.out.println("");
			System.out.println(e.toString());

		}
		finally // try에서 어떤 이유로 예외가 발생해도 반드시 실행되어야 하는 코드
		{
			System.out.println("예외~ 정상처리!");
		}
		
		System.out.println("Thanks!");
	}
}
	
