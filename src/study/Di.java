package study;


interface Dao
{
	// ����Ÿ ���̽��� ���� � ���� ������� �𸦶�
	public abstract void Insert();
	public abstract void Delete();
	public abstract void Update();
	public abstract void Select();
}

class OracleDao implements Dao{

	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Select() {
		// TODO Auto-generated method stub
		
	}
	}

class MysqlDao implements Dao{

	@Override
	public void Insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Select() {
		// TODO Auto-generated method stub
		
	}
	
}

class DataService
{

	private IDao dao;
	
	public DataService(Idao dao)
	public void Select()
	{
		dao.Select();
	}
	
	
}

public class Di {
	public static void main(String[] args){
		DataService ds = new DataService(new MysqlDao());
	}
	

}
