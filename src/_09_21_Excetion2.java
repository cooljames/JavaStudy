/**
 * 예외 발생시키기
 */
import java.util.Scanner;

class AgeException extends Exception
{

}

public class _09_21_Excetion2 {

	public static void main(String[] args) {

		try {

			Scanner scan = new Scanner(System.in);
			int age = scan.nextInt();

			if (age <= 0 || age > 200) {
				
				throw new Exception();
				
			}
		} catch (Exception e) {
			String errorMessage = e.toString();
			System.out.println(e.toString());
			
			System.out.println("error는 :" + errorMessage);
			
		}
	}
}
