/**
 * @author James
 *
 * -> error ����: ����, �������, ġ������ ����, �޸�, JVM����
 * -> exception ����: ����ġ ���� ��Ȳ�� ���� ó��
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
		finally // try���� � ������ ���ܰ� �߻��ص� �ݵ�� ����Ǿ�� �ϴ� �ڵ�
		{
			System.out.println("����~ ����ó��!");
		}
		
		System.out.println("Thanks!");
	}
}
	
