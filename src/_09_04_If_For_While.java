import java.util.*;
/**
 * @author bit-user
 *
 * ���: ���α׷��� ������ �帧�� �����ϴ� ����!!
 *  
 *   - �б⹮(if ~ else, if ~else if else, switch ~ case)
 *     	-> Ư�����ǿ� ���� �ҽ��ڵ带 ���������� �����ϰ� �ϴ� ����
 *     		  . if ~ else �� ������ �Ǵ��� �� ���
 *    	-> switch (Grade)  // switch ~ case ������ ������ ���ڿ��� �����ϴ�.
 *   =============================================================  
 *   - �ݺ���(while, for, do ~ while, foreach)
 * 		-> c������ ������ �ݺ�
 * 
 *        . �ݺ����� ������ ���
 *         1) �ʱⰪ
 *         2) ����
 *         3) ����
 *         
 * 		ex)2000��~2015����� ����� ���̵��� ���� ����϶�.
 * 
		 - �������� ������ ���� �Ʒ��� ������ ��Ҹ� ã�ƶ�~!.
		    < �ʱⰪ  2000 // ���� <= 2015 // ���� ++ >
		    
		ex)a ���� z������ ȭ�鿡 ����϶�.
		
		do ~ while : ���� �� ���ǰ˻�.
		  -> ������ ����� ���� ���࿡ ������ ��ġ�� ���
		 
		ex) ����ڿ��� 0�� �Է��� ������ ���.     
		    
		    
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
			  else System.out.println("Ȧ��");
		
		
		data = (data%2 == 0) ? data/2 : data *2;
		System.out.println(data);
		
		if (data%2 == 0){
		System.out.println(data + " ¦���̸� true�̴�.");
		}
		else 
			System.out.println("Ȧ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���~!");

		int Grade = scan.nextInt();
			
/*		 if (Grade >= 1 && Grade <=6 ){
			System.out.println(Grade + "�г�" + "�ʵ��л��Դϴ�.");
		}
		else
		{
			System.out.println("����� ���̸� �ʹ� ���� �Ծ����...!!!");
		}
  
		switch (Grade)  // switch ~ case ������ ������ ���ڿ��� �����ϴ�.
		{
		case 1: System.out.println("���Ի�"); 			break;
		case 2: System.out.println("�����");			break;
		case 3: System.out.println("�̶� ����");			break;
		case 4: System.out.println("�ٽ� ���");				break;
		case 5: System.out.println("����� ����");			break;
		case 6: System.out.println("�� ��Ҵ�.");				break;
		default: System.out.println("1~6�� �Ϸ��ϼ���.");	break;
		}*/
		
		int i = Grade; // �ʱⰪ
		
		while(i <= 2015 )//  ����
		{//�����ڵ�
			System.out.println("�Է��� �⵵�� : " + i + "�� �Դϴ�.");
			i++;
		}
		
		for (int j = 2000; j <= 2015; j++) {
			System.out.println(j);
		}
		
		int sum = 0;
		int input = 0;
		Scanner scanNum = new Scanner(System.in);
		
		do //�����ڵ�
		{
			System.out.println("input:" );
		input = scanNum.nextInt();
		sum += input;
		}while(input!=0);
		System.out.println(sum);
			
	}
}