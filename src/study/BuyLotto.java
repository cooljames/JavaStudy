package study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author James 2015 .09 .08
 *
 */
public class BuyLotto {

	/**
	 * @param args 
	 * scan
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("비트 로또방에 오신것을 환영합니다. 몇장 드릴까요?");
		Scanner scan = new Scanner(System.in);  // user부터 입력 받음 
		int scanNum = scan.nextInt(); // 객체 생성 
		
		if (scanNum > 10)
			System.out.println("야 이놈아 패가망신한다. 돈 좀 아껴써라~!");
		 else
		
	     for (int j = 0;  j <= scanNum - 1; j++) {
		   for(int i=0; i<5; i++){
			 int[] lottoNum = new int[5];
			 int rnd = (int) (Math.random() * 45) + 1; // random 객체를 통해서 범위 설정 (0 부터 45번째 의미)
			 lottoNum[i] = rnd; 
			 
			   if (Arrays.asList(lottoNum).contains(rnd)) // compareTo List.
				  i = (i - 1); // 동일한 인자가 나오면 loop again!
			   
				String lBracket = "[";
				String rBracket = "]";
				String lottoNumLast = lBracket + rnd + rBracket;
			 System.out.print(lottoNumLast);
		 }
		 System.out.println("");
		 scan.close(); // Object close
	}
	}
}

