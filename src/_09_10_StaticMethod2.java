//static

import java.math.*;

class HighTempler
{
	int hp = 100; // ü��
	int mana = 200; // ���� ���÷��� ������
	static int mana_Max = 200; // �ִ� ����������
    
	void Stom()
	{
		if(mana >= 75)
		{
			System.out.println("���� �߻�~~~~~!");
			mana -=75;
		}
	}
	
	static void ManaUp(){mana_Max += 50;} // ���� ���׷��̵�

}

public class _09_10_StaticMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HighTempler.ManaUp();//���� ���׷��̵�.
		
		// c�� c ++ �Լ��� ��������ó�� ���� ���ؼ� static �Լ��� �����ؼ� ����Ѵ�.
		
		System.out.println(Math.ceil(3.14));
		
		// ��ǥ���� ���� Math�Լ��̴�.
	}
}
