/**
 * @author James
 * 
 * Ŭ���� ����̳� �������̽��� ������� ������, ��������� ������Ʈ�� ���� �� ��ó�ϱⰡ ��ƴ�.
 */


interface IBunkerable
{
	public abstract void In();
	void out();  // public abstract�� �����ص� �⺻������ �ִ� ���� ����.
}
abstract class BIO implements IBunkerable
{
	private int hp;// ü��
	public abstract void Attack();
	/* (non-Javadoc)
	 * @see IBunkerable#In()
	 */
	@Override
	public void In() {
		// TODO Auto-generated method stub
		System.out.println("��Ŀ�� ���ϴ�.");
	}
	/* (non-Javadoc)
	 * @see IBunkerable#out()
	 */
	@Override
	public void out() {
		// TODO Auto-generated method stub
		System.out.println("��Ŀ���� ���ɴϴ�.");
	}
}
class UsMarine extends BIO
{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
	System.out.println("ŸŸŸŸŸŸ~!!!");	
	}
}

class Bunker // �Ӽ�
{
	private int Hp; // ü��
	private int cnt = 0;
	private IBunkerable[] BioList= new BIO[4];
	
	public void In(BIO bio)
	{
		if(cnt > 4)
		{
			BioList[cnt] = bio;
			cnt++;
			
			System.out.println("CNT�� ���Խ��ϴ�.");
		}
	}
	public void Out(int index)
	{
		BioList[index] = null;
	}
	public void Attack()
	{
			bio.Attack();
		}
	}
	
}

class FireBat extends BIO
{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		for(IBunkerable unit:List)
		{
			
		}
		
	System.out.println("���̾�~~~~!!!");
	}
	
}

class SCV extends BIO
{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("����������~~!!!");
		
	}
}

public class _09_18_MiniStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsMarine m1 = new UsMarine();
		FireBat f1 = new FireBat();
		Bunker b1 = new Bunker();
		b1.In(m1);
		b1.In(f1);
	}
}
