/**   =========
 *   * �������̵�
 *   ===========
 *   
 *   --> �θ� Ŭ�������� ���ǵ� �ൿ�� �ڽ� Ŭ�������� ���Ӱ� �ٽ� ���� �ϴ� ��!
 *   �����ε�: ���� �̸��� �Լ��� �Ű� ������ ������ Ÿ�Կ� ���� ���� �ٸ��� �νĵǴ� ��
 *    / 1���� Ŭ������ ���� �̸��� �޼ҵ尡 ������ ����!
 *    
 *   --> ��Ӱ��迡�� �θ��� �޼ҵ�(�ൿ)�� �״�� ��ӹ޾� ����ϴ� ���� �ƴ϶�
 *   �ڽ�Ŭ�������� ���ο� �ൿ�� �����ϴ� ��! -> ������!(�������̵�)
 *    
 */

/**
 * @author James 09-15
 *
 */

class animal
{
	public void Crying(){
		System.out.println("����");
	}
	public void Sleep(){
		System.out.println("�ܴ�~~~!");
	}
	public String Name(){
		System.out.println(this + "�̴�");
		return null;
	}
}


class Cat extends animal
{
	public void Crying() {System.out.println("�߿�");}
}

class Dog extends animal
{
	public void Crying() {System.out.println("�۸�");}
}




public class _09_15_Override1 {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.Crying();
		Dog dog = new Dog();
		dog.Crying();
		dog.Sleep();
		cat.Name();
		cat.Sleep();
	}

}
