//static

import java.math.*;

class HighTempler
{
	int hp = 100; // 체력
	int mana = 200; // 현재 템플러의 에너지
	static int mana_Max = 200; // 최대 마법에너지
    
	void Stom()
	{
		if(mana >= 75)
		{
			System.out.println("전기 발사~~~~~!");
			mana -=75;
		}
	}
	
	static void ManaUp(){mana_Max += 50;} // 마나 업그레이드

}

public class _09_10_StaticMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HighTempler.ManaUp();//마나 업그레이드.
		
		// c나 c ++ 함수의 전역변수처럼 쓰기 위해서 static 함수만 정의해서 사용한다.
		
		System.out.println(Math.ceil(3.14));
		
		// 대표적인 것이 Math함수이다.
	}
}
