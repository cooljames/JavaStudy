/**
 * @author James
 * ===============================
 *    interface  �ڵ带 ��� ������ �Ѵ�. // ����. ������
 * ===============================
 * - Ŭ������ Ŭ������ ������ ���
 * - Ŭ������ ������ �ൿ�� ���ؼ� ���� �� �ְ� �����ϴ� ����� ����!
 * - �߻�Ŭ���� ���� �� �߻�ȭ��  Ŭ����: �� ����� ���ؼ��� ���!!
 */

abstract class Sport
{
	public abstract void Run();
	public abstract void Walk();
}

abstract class BasketBall implements Sports
{ // 1.static final ��� 2. public abstract Method
	public void play(){} 	
	public void end(){}
}

public class _09_17_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasketBall bb = new Sport();

	}
}
