/**
 * @author James
 */
public class _09_07_Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� �迭 --> [] [] [] .....
		int [] array1 = new int[5];

		// ������ �迭 --> 1���� �迭�� ����
		//(5��¥�� 1���� �迭�� 3�� ������ �װ��� 3���� �迭�� �����ض�~!)
		int []/**��*/ array3 []/**��*/ = new int[2][3]; /** 2��¥�� �迭�̴�~! */
		System.out.println(array1.length);
		System.out.println(array3.length); // ���α׷��� c�迭�� ���� ���� �������̴�.
		
		for (int i = 0; i < array3.length; i++) 
		{ // 2�� ����
			for (int j = 0; j < array3[i].length; j++) 
			{ // 3�� ����
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
	
	
