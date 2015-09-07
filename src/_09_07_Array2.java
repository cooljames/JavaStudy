/**
 * @author James
 */
public class _09_07_Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1차원 배열 --> [] [] [] .....
		int [] array1 = new int[5];

		// 다차원 배열 --> 1차원 배열의 집합
		//(5개짜리 1차월 배열이 3개 있으면 그것은 3개의 배열로 생각해라~!)
		int []/**행*/ array3 []/**열*/ = new int[2][3]; /** 2개짜리 배열이다~! */
		System.out.println(array1.length);
		System.out.println(array3.length); // 프로그래밍 c계열의 언어에서 전부 공통적이다.
		
		for (int i = 0; i < array3.length; i++) 
		{ // 2번 루핑
			for (int j = 0; j < array3[i].length; j++) 
			{ // 3번 루핑
			System.out.println("[" + array3[i][j] + "]" );
		}
		System.out.println("");
	}
  }
}
/*	for(int[] arr: array3)
	{
		for(int value: arr);
		{
		System.out.println(arr);
		{
		System.out.println("");
	}*/
	
	
