package study;

import java.util.*;

/**
 * @author James 2015 .09 .08
 */

public class MyLotto {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("비트 로또방에 오신것을 환영합니다.");
		System.out.println("몇장 드릴까요? 키보드로 눌러주세요!");
		Scanner scan = new Scanner(System.in); // user부터 입력 받음
		int scanNum = scan.nextInt(); // 객체 생성
		if (scanNum > 10)
			System.out.println("어허~ 이러시면 안됩니다~! 10장까지만 살 수 있어요.");
		else
			for (int j = 0; j <= scanNum - 1; j++) {
				System.out.println("-------------------------");
				for (int i = 0; i < 5; i++) {
					int[] lottoNum = new int[5];
					int rnd = (int) (Math.random() * 45) + 1;   // random 객체를 통해서
																// 범위 설정 (0 부터
																// 45번째 의미)

					lottoNum[i] = rnd;
					if (Arrays.asList(lottoNum).contains(rnd)) // compareTo
															   // Array List.

						i = (i - 1); // 동일한 인자가 나오면 loop again!
					String lBracket = "[";
					String rBracket = "]";
					String lottoNumLast = lBracket + rnd + rBracket;
					System.out.print(lottoNumLast);
				}

				System.out.println("");
				System.out.println("-------------------------");

			}

		System.out.println("감사합니다~항상 대박나시고 또 오세요^^");
		System.out.println("/***********************/");

		scan.close(); // Object close
	}

}
