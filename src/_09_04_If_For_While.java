import java.util.*;
/**
 * @author bit-user
 *
 * 제어문: 프로그램의 실행의 흐름을 제어하는 구문!!
 *  
 *   - 분기문(if ~ else, if ~else if else, switch ~ case)
 *     -> 특정조건에 따라 소스코드를 선택적으로 실행하게 하는 구문
 *     	  . if ~ else 참 거짓을 판단할 때 사용
 *     -> switch (Grade)  // switch ~ case 문에는 정수와 문자열만 가능하다.
 *     
 *   - 반복문(while, for, do ~ while, foreach)
 */
public class _09_04_If_For_While {
	
	public static void main(String[] args){
		//조건연산자 (삼항 연산자)
		//문법 : 조건이 true일 경우 실행 코드
		        // 조건이 false일 경우 실행 코드

/*		Random rand = new Random();
		int data = rand.nextInt();
		int val  = (data%2);
		if (val == 0) System.out.println("짝수");
			  else System.out.println("홀수");*/
		
		
	//	data = (data%2 == 0) ? data/2 : data *2;
	//	System.out.println(data);
		
/*		if (data%2 == 0){
		System.out.println(data + " 짝수이면 true이다.");
		}
		else 
			System.out.println("홀수입니다.");
		System.out.println("프로그램을 종료합니다.");*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학년을 입력해주세요~!");

		int Grade = scan.nextInt();
			
		 if (Grade >= 1 && Grade <=6 ){
			System.out.println(Grade + "학년" + "초등학생입니다.");
		}
		else
		{
			System.out.println("당신은 나이를 너무 많이 먹었어요...!!!");
		}
  
/*		switch (Grade)  // switch ~ case 문에는 정수와 문자열만 가능하다.
		{
		case 1: System.out.println("신입생"); 			break;
		case 2: System.out.println("한참놀때");			break;
		case 3: System.out.println("이때 놀면");			break;
		default: System.out.println("1~4만 일력하세요.");	break;*/
				
		}
}
	


