/**
 * @author James
 * 
 * ========================================
 * >> �߻� Ŭ���� <<
 * - ���� ��üȭ�� ���� ������ ��Ӹ��� ���ؼ� �ۼ��Ǿ��� Ŭ����
 * - 1�� �̻��� �߻� �޼��带 ����!(�ʵ�� �޼��嵵 ��)
 * �߻�޼���� 
 * -> ���� (�ൿ)�� �������� ������ �ڽ� Ŭ������ ������ ����ϴ� �ż���!
 * ========================================
 * 
*/

abstract class Car  // �ڽ� Ŭ������ ����� ���� �ǵ������� �����.
{
	private int Fuel; // ����
	
	// �߻� �޼���: �θ𿡼��� ������ ���� ������ �ڽĿ��� �ݵ�� �������̵� �ؼ� ���� �Ѵ�.
	public abstract void Go(); // {}�� �ʿ����. => �߻� �޼���
	public void Stop(){
		
		System.out.println("�극��ũ ��Ҿ��.");
	}; 
	
}

class E_Car extends Car
{

	@Override
	public void Go() {
		// TODO Auto-generated method stub
		System.out.println("Motor ���� ~~!");
		
	}

	
}

class BUS extends Car{

	@Override
	public void Go() {
		// TODO Auto-generated method stub
		System.out.println("���ϴ�~~!");
	}

}

public class _09_16_Abstraction {
	
	public static void main(String[] args){
		
 }
	
}
