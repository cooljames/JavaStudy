import java.util.*;
/**
 * @author bit-user
 *
 * ���: ���α׷��� ������ �帧�� �����ϴ� ����!!
 *  
 *   - �б⹮(if ~ else, if ~else if else, switch ~ case)
 *     -> Ư�����ǿ� ���� �ҽ��ڵ带 ���������� �����ϰ� �ϴ� ����
 *     	  . if ~ else �� ������ �Ǵ��� �� ���
 *     -> switch (Grade)  // switch ~ case ������ ������ ���ڿ��� �����ϴ�.
 *     
 *   - �ݺ���(while, for, do ~ while, foreach)
 */
public class _09_04_If_For_While {
	
	public static void main(String[] args){
		//���ǿ����� (���� ������)
		//���� : ������ true�� ��� ���� �ڵ�
		        // ������ false�� ��� ���� �ڵ�

/*		Random rand = new Random();
		int data = rand.nextInt();
		int val  = (data%2);
		if (val == 0) System.out.println("¦��");
			  else System.out.println("Ȧ��");*/
		
		
	//	data = (data%2 == 0) ? data/2 : data *2;
	//	System.out.println(data);
		
/*		if (data%2 == 0){
		System.out.println(data + " ¦���̸� true�̴�.");
		}
		else 
			System.out.println("Ȧ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�г��� �Է����ּ���~!");

		int Grade = scan.nextInt();
			
		 if (Grade >= 1 && Grade <=6 ){
			System.out.println(Grade + "�г�" + "�ʵ��л��Դϴ�.");
		}
		else
		{
			System.out.println("����� ���̸� �ʹ� ���� �Ծ����...!!!");
		}
  
/*		switch (Grade)  // switch ~ case ������ ������ ���ڿ��� �����ϴ�.
		{
		case 1: System.out.println("���Ի�"); 			break;
		case 2: System.out.println("�����");			break;
		case 3: System.out.println("�̶� ���");			break;
		default: System.out.println("1~4�� �Ϸ��ϼ���.");	break;*/
				
		}
}
	


