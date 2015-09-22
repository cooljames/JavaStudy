abstract class Cage{
	private int CageNo;
	
	
	public Cage(int CageNo){}
	
	public void IN(ISwimming swimmer) {
		// TODO Auto-generated method stub
		
	}

	public abstract void IN();
	public abstract void OUT();
}


/* 다중 상속의 경우 Diamond Problem이 생기게 된다.
 * 겹쳐지는 변수가 있을 경우....반드시 발생.
*/
interface ISwimming
{
	public abstract void swimming();	
}
interface IFly
{
	public abstract void fly();
}
abstract class animals
{
	public abstract void feeding();
}
abstract class Fishes extends animals
{

	
}

abstract class birds extends animals implements IFly
{

	/* (non-Javadoc)
	 * @see IFly#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see animals#feeding()
	 */
	@Override
	public void feeding() {
		// TODO Auto-generated method stub
		
	}


}

class penguin extends birds implements ISwimming
{

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}

}

abstract class flyingfish extends Fishes
{
	
}

class WaterCage extends Cage
{
	public WaterCage(int CageNo) {
		super(CageNo);
		// TODO Auto-generated constructor stub
	}

	private ISwimming [] Swimer = new ISwimming[200];



	@Override
	public void OUT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IN(ISwimming swimmer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IN() {
		// TODO Auto-generated method stub
		
	}
	
}

