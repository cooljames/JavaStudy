import java.util.Scanner;

/**
 * @author James
 * @parameter : �Ű�����
 * 
 * 1) �޴�ü��
 * =================================
 * -> 2���� �迭�� �̿��� ����Ÿ��
 * -> 1~3�� 
 *    [][][][][]
 *    [][][]
 *    [][][][][][]
 *    
 *  -> ������ȣ�� ����
 * ===============
 * 1)����  2)����  3)���  4)�������� ����
 *    
 */
public class _09_08_Homework {
	
	public static void InsertCar(int [][] Parking){ //����
	}
	//����ڿ��� ���� �� ��ġ�� ����  ��ȣ�� �Է� �޾� ����!!
	
	public static void ParkSetting(int[][] Parking) { //��ŷ���� ����
		Scanner scan = new Scanner(System.in);
		int size = 0;
		int j = scan.nextInt(); // ��ü ���� 
		
		for(int i=0; i<4; i++){
			for(j=0; j<4; j++)
			{
			System.out.print("��������: ");
		   }
		}
	}
	public static void Print(int[][] Parking) //��� 
	{
		for(int[] is: Parking){
			for(int i: is){
				if(i==0)
					System.out.print("[��������]");
				else
					System.out.println("");
			}
		}
	}
	public static void DeleteCar(int[][] Parking) {//����
		
		// ����ڿ��� ������ȣ�� �Է� �޾Ƽ� �ش��ϴ� ������ ��ȣ�� ����
	}
	
	   
	public static void main(String[] args) {
		int[][] Parking = new int[3][]; // ����ڿ��� ���� ���� ���� Ȯ��!
		int Select = 0;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("1)����  2)����  3)���  4)�������� ���� 0)����");
			Select = scan.nextInt();
		
		switch (Select) {
		case 1: InsertCar(Parking); break;
		case 2: DeleteCar(Parking); break;
		case 3: Print(Parking); break;
		case 4: ParkSetting(Parking); break;
	    case 0: return; // End

		}
	  }
	}
}
	
	


