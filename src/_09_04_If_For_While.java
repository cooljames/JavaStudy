import java.util.*;
/**
 * @author bit-user
 *
 * 제어문: 프로그램의 실행의 흐름을 제어하는 구문!!
 *  
 *   - 분기문(if ~ else, if ~else if else, switch ~ case)
 *     	-> 특정조건에 따라 소스코드를 선택적으로 실행하게 하는 구문
 *     		  . if ~ else 참 거짓을 판단할 때 사용
 *    	-> switch (Grade)  // switch ~ case 문에는 정수와 문자열만 가능하다.
 *   =============================================================  
 *   - 반복문(while, for, do ~ while, foreach)
 * 		-> c언어에서의 최초의 반복
 * 
 *        . 반복문의 세가지 요소
 *         1) 초기값
 *         2) 조건
 *         3) 증감
 *         
 * 		ex)2000년~2015년까지 출생한 아이들의 수를 출력하라.
 * 
		 - 서술문을 들으면 먼저 아래의 세가지 요소를 찾아라~!.
		    < 초기값  2000 // 조건 <= 2015 // 증감 ++ >
		    
		ex)a 에서 z까지를 화면에 출력하라.
		
		do ~ while : 실행 후 조건검사.
		  -> 실행의 결과가 다음 실행에 영향을 미치는 경우
		 
		ex) 사용자에게 0을 입력할 때까지 출력.     
		    
		    
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
			  else System.out.println("홀수");
		
		
		data = (data%2 == 0) ? data/2 : data *2;
		System.out.println(data);
		
		if (data%2 == 0){
		System.out.println(data + " 짝수이면 true이다.");
		}
		else 
			System.out.println("홀수입니다.");
		System.out.println("프로그램을 종료합니다.");
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력해주세요~!");

		int Grade = scan.nextInt();
			
/*		 if (Grade >= 1 && Grade <=6 ){
			System.out.println(Grade + "학년" + "초등학생입니다.");
		}
		else
		{
			System.out.println("당신은 나이를 너무 많이 먹었어요...!!!");
		}
  
		switch (Grade)  // switch ~ case 문에는 정수와 문자열만 가능하다.
		{
		case 1: System.out.println("신입생"); 			break;
		case 2: System.out.println("한참놀때");			break;
		case 3: System.out.println("이때 놀자");			break;
		case 4: System.out.println("다시 놀다");				break;
		case 5: System.out.println("제대로 놀자");			break;
		case 6: System.out.println("다 놀았다.");				break;
		default: System.out.println("1~6만 일력하세요.");	break;
		}*/
		
		int i = Grade; // 초기값
		
		while(i <= 2015 )//  조건
		{//실행코드
			System.out.println("입력한 년도는 : " + i + "년 입니다.");
			i++;
		}
		
		for (int j = 2000; j <= 2015; j++) {
			System.out.println(j);
		}
		
		int sum = 0;
		int input = 0;
		Scanner scanNum = new Scanner(System.in);
		
		do //실행코드
		{
			System.out.println("input:" );
		input = scanNum.nextInt();
		sum += input;
		}while(input!=0);
		System.out.println(sum);
			
	}
}