/**
 *  java����� ������....
 *   -> ����� --> �޸��� ��� ������ ����Ǿ�������?
 *   main�Լ��� �����θ� �ý��ۿ� ���ؼ� ȣ���Ѵ�.
 *   (�����θ� �ý�����, �ü�� ���� ȣ���ϴ� �Լ��� callback�Լ���� �Ѵ�.)
 *   
 *   ����Memory(���� ������ ���� ������.fifo)
 *  1)�������� : �޼ҵ� ������ ����� ����(�Լ��� stack)  
 *  2)�������(�ʵ�) : Ŭ������ ����Ǿ��� ������
 *      - �ν��Ͻ� ����(instance) : ��ü���� �����Ǵ� ����
 *      - Ŭ���� ����(Static Member ����) : Ŭ������ 1���� �����Ǵ� ����
 *      Starcraft Marine�� 
 *  3)
 */

/**
 * @author James
 */

class Marine
		{
			//�Ӽ�
			int kills;          // ��ȭ  - ��� ���ϹǷ� ��ü���� �����ؾ� ��. : instance field
			int power;          // ��ȭ 
	
			static	int cost;           // ��ȭ���� ���� 
			//- �� ������ ��Ƽ� static�� ������ : static field(Ŭ��������: Ŭ������ 1�� ����)
			//	Ŭ������ ���� �����ؼ� ��ΰ� ���� 
			// 
			static	int attack_power;   // ��ȭ���� ����
			static	int defense_power;  // ��ȭ���� ����
			
			
			//�ൿ
			
			void attack(){}
			void move(){System.out.println("gogogo!");}
		}
// =================
// ��Ʈ ���б� ���� ���α׷�
// =================
class BitSchool
{
	int Student_No; // �й�
	static String EstablishDay;
}

public class _09_09_Variable_Field {

	/**
	 * @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� ���¿��� ������ ���ݷ� ���׷��̵尡 �����Ѱ�?
		// ��ü�� ���� ���¿����� Ŭ������ ���ؼ� ���� ��� ����
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		System.out.println(++Marine.attack_power);
		
		m1.attack();
		m2.move();

	}

}
