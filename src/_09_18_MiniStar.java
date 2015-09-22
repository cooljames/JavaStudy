/**
 * @author James
 * 
 * 클래스 상속이나 인터페이스를 사용하지 않으면, 장기적으로 업데이트나 변경 시 대처하기가 어렵다.
 */


interface IBunkerable
{
	public abstract void In();
	void out();  // public abstract를 생략해도 기본적으로 있는 것을 간주.
}
abstract class BIO implements IBunkerable
{
	private int hp;// 체력
	public abstract void Attack();
	/* (non-Javadoc)
	 * @see IBunkerable#In()
	 */
	@Override
	public void In() {
		// TODO Auto-generated method stub
		System.out.println("벙커로 들어갑니다.");
	}
	/* (non-Javadoc)
	 * @see IBunkerable#out()
	 */
	@Override
	public void out() {
		// TODO Auto-generated method stub
		System.out.println("벙커에서 나옵니다.");
	}
}
class UsMarine extends BIO
{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
	System.out.println("타타타타타타~!!!");	
	}
}

class Bunker // 속성
{
	private int Hp; // 체력
	private int cnt = 0;
	private IBunkerable[] BioList= new BIO[4];
	
	public void In(BIO bio)
	{
		if(cnt > 4)
		{
			BioList[cnt] = bio;
			cnt++;
			
			System.out.println("CNT가 들어왔습니다.");
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
		
	System.out.println("파이어~~~~!!!");
	}
	
}

class SCV extends BIO
{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("지지지지직~~!!!");
		
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
